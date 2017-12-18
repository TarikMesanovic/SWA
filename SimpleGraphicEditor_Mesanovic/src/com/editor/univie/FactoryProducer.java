package com.editor.univie;

import javax.servlet.http.HttpServletRequest;

public class FactoryProducer {
	public static AbstractFactory getFactory(String shape) {
		
		if(shape.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}
		return null;
	}
	
}
