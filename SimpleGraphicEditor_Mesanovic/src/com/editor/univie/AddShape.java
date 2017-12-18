package com.editor.univie;
// TEST
public class AddShape implements Strategy {

	@Override
	public String createShape(String shape) {
		
		if(shape.equalsIgnoreCase("circle")){
			Circle circle= new Circle();
			shape= circle.create();
		}
		else {
			return null;
		}
		
		return shape;
		
	}

}
