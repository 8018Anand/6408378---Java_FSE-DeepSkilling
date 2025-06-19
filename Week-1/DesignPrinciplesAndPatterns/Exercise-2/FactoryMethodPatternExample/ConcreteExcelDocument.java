package com.FactoryMethodPatternExample;

public class ConcreteExcelDocument extends ExcelDocument{
	public void create() {
		System.out.println("Excel Document Created");
	}
}
