package com.editor.univie;

public class AbstractFactoryPattern{
	 public void Creator(String shape) {

		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		//get the circle object
		Shape circle = shapeFactory.getShape("CIRCLE");
		//call create method
		circle.create();
		
		//get the line object
		Shape line = shapeFactory.getShape("LINE");
		//call create method
		line.create();
				
		//get the ellipse object
		Shape ellipse = shapeFactory.getShape("ELLIPSE");
		//call create method
		ellipse.create();

		//get the triangle object
		Shape triangle = shapeFactory.getShape("TRIANGLE");
		//call create method
		triangle.create();
		
		//get the quadrangle object
		Shape quadrangle = shapeFactory.getShape("QUADRANGLE");
		//call create method
		quadrangle.create();
		
		//get the ngon object
		Shape ngon = shapeFactory.getShape("NGON");
		//call create method
		ngon.create();
		
		//get the star object
		Shape star = shapeFactory.getShape("STAR");
		//call create method
		star.create();
		
		//get the text object
		Shape text = shapeFactory.getShape("TEXT");
		//call create method
		text.create();
			
				
	}
}
