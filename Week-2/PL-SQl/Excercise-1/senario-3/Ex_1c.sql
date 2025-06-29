SET SERVEROUTPUT ON;

BEGIN
	FOR c IN ( SELECT name 
		   FROM Customers
		   WHERE CustomerId IN 
		   (SELECT CustomerId 
		   FROM Loans 
		   WHERE SYSDATE - ENDDATE <= 30)) LOOP

		DBMS_OUTPUT.PUT_LINE(c.name || ' Your due is in next 30 days');

	END LOOP;
END;
/


/*SELECT name 
FROM Customers
WHERE CustomerId IN 
(SELECT CustomerId 
FROM Loans 
WHERE SYSDATE - ENDDATE <= 30)


select * from customers cust
		   JOIN Loans l ON
		   cust.CustomerID = l.CustomerID
		   where l.ENDDATE - SYSDATE <= 30*/