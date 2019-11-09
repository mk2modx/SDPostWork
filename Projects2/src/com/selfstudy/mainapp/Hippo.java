package com.selfstudy.mainapp;

public class Hippo extends Carnivore{

	public Hippo() {
		
	}
	
	public Hippo(String firstName) {
		super(firstName);
	}
	
	public void eat(int food) {
		super.eat(food);
		System.out.println("Hungry Hungry Hip Hop.");
	}
	
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Don't fat shame me.");
	}
	
	public Animal eat(Animal eatAnimal) {
		super.eat(eatAnimal);
		return eatAnimal;
		
	}
	
}
