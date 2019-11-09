package com.selfstudy.mainapp;

public class Elephant extends Herbivore{

	public Elephant() {
		
	}
	
	public Elephant(String firstName) {
		super(firstName);
	}
	
	public void makeNoise() {
		super.makeNoise();
		System.out.println(" I have a big Tummy!");
	}
	
	public void eat(int food) {
		super.eat(food);
		makeNoise();
	}
	
}
