package com.selfstudy.mainapp;

public class Attendant {

	public Attendant() {
		
	}
	
	public void feedAnimal(Animal animal, int food) {
		System.out.println("I am feeding this " + animal.getClass().getSimpleName() + " " + food);
		
		if (animal instanceof Herbivore) {
			System.out.println("Here eat some Plant based goodies.");
		}
		else if (animal instanceof Carnivore) {
			System.out.println("Here eat some Meat based goodies.");
		}
	}
	
	public void doRounds(Animal[] animals) {
	System.out.println(" Walking around ");
	int amount = 20;
	
	for(int i = 0; i < animals.length; i++) {
		
		if(animals[i] != null) {
		feedAnimal(animals[i], amount);
		}
		}
	}
	
}
