package com.SingletonPatternExample;

public class Test {
	public static void main(String[] args) {
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();
//		System.out.println(l1.equals(l2));
		if(l1.equals(l2)) {
			System.out.println("Both references are same");
		} else {
			System.out.println("Both references are not same");
		}
	}
}
