package com.selfstudy.mainapp;

public class Lion extends Carnivore{

	public Lion () {
		
	}
	
	public Lion (String firstName) {
		super(firstName);
		
	}
	
	public void makeNoise() {
		System.out.println("They're Grrrrreaat!");
	}
	
	public void eat(int food) {
		super.eat(food);
		System.out.println("Damn that's good.");
	}

	public Animal eat(Animal eatAnimal) {
		super.eat(eatAnimal);
		return eatAnimal;
		
	}
	
	
}
