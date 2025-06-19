package com.FactoryMethodPatternExample;

public class DocumentFactory {
	public Document createDocument(String type) {
		if(type.equalsIgnoreCase("pdf")) {
			return new ConcretePdfDocument();
		} else if(type.equalsIgnoreCase("word")) {
			return new ConcreteWordDocument();
		}
		return new ConcreteExcelDocument();
	}
}
