package com.editor.univie;

public class ShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		
		if(shapeType == null) {
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("LINE")) {
			return new Line();
		}
		else if(shapeType.equalsIgnoreCase("ELLIPSE")) {
			return new Ellipse();
		}
		else if(shapeType.equalsIgnoreCase("NGON")) {
			return new Ngon();
		}
		else if(shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		else if(shapeType.equalsIgnoreCase("TEXT")) {
			return new Text();
		}
		else if(shapeType.equalsIgnoreCase("STAR")) {
			return new Star();
		}
		else if(shapeType.equalsIgnoreCase("QUADRANGLE")) {
			return new Quadrangle();
		}
		return null;
	}
	

}
