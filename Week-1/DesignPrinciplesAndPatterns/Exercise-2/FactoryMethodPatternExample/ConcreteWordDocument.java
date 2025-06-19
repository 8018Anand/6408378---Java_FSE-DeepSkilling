package com.FactoryMethodPatternExample;

public class ConcreteWordDocument extends WordDocument{
	public void create() {
		System.out.println("Word Document Created");
	}
}
