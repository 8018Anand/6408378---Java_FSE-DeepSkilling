package com.FactoryMethodPatternExample;

public class ConcretePdfDocument extends PdfDocument{
	public void create() {
		System.out.println("Pdf Document Created");
	}
}
