package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hibernate.model.Employee;

import jakarta.transaction.SystemException;

@SpringBootApplication
public class HibernateApplication {
	
	public static SessionFactory sessionFactory;
	
	public static void buildSession() {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static Long saveEmployeeByHibernate(Employee e) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Long empId = null;
		
		try {
			tx = (Transaction) session.beginTransaction();
			session.persist(e);
			tx.commit();
			empId = e.getId();
		} catch(Exception ex) {
			if(tx != null) tx.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return empId;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HibernateApplication.class, args);
		
		buildSession();
		Employee e = new Employee();
		e.setId(3L);
		e.setName("Panda");
		e.setSalary((double)200000);
		Long empId = saveEmployeeByHibernate(e);
		System.out.println(empId);
		
	}

}

