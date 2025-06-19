package com.FinancialForeCasting;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		int initialValue; //initial year is considered as 0
		double growthRate; //growth rate we observed in past
		int peroid; //on which period from now we want to find the financialForecasting
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the initalValue :");
		initialValue = sc.nextInt();
		System.out.print("Enter the growthRate :");
		growthRate = sc.nextDouble();
		System.out.print("Enter the peroid :");
		peroid = sc.nextInt();
		
		double result = forecastRecursive.forecast(initialValue, growthRate, peroid);
		System.out.print("The forecasted value is :" + result);
		sc.close();
	}
}
