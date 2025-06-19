package com.FinancialForeCasting;

public class forecastRecursive {
	public static double forecast(int initialVal, double rate, int period) {
		if(period == 0) { //Base condition
			return initialVal;			
		}
		return forecast(initialVal, rate, period - 1) * (1 + rate);
	}
}
