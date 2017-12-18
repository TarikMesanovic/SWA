package com.editor.univie;


public class Circle implements Shape{
	@Override
	public String create() {
		
		String text = "<circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"black\" stroke-width=\"3\" fill=\"red\" />";
		return text;
	}
	
	
}
