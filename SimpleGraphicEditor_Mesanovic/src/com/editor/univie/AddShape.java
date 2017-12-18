package com.editor.univie;
// TEST2
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
