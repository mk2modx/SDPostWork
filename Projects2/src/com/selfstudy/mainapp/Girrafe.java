package com.selfstudy.mainapp;

public class Girrafe extends Herbivore{

	public Girrafe() {
		
	}
	
	public Girrafe(String firstName) {
		super(firstName);
	}
	
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Yum Yum , That's good shit!");
	}
	
	public void eat(int food) {
		super.eat(food);
		makeNoise();
	}
	
	
}
