package com.editor.univie;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy=strategy;
	}
	public String executeStrategy(String shape) {
		return strategy.createShape(shape);
	}
}
