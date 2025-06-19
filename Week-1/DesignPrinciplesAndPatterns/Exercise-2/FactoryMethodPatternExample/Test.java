package com.FactoryMethodPatternExample;

public class Test {
	public static void main(String[] args) {
		DocumentFactory factory = new DocumentFactory();
		Document pdf = factory.createDocument("pdf");
		pdf.create();
		Document word = factory.createDocument("word");
		word.create();
		Document excel = factory.createDocument("excel");
		excel.create();		
	}
}
