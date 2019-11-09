package com.selfstudy.mainapp;

public class Carnivore extends Animal{
	
	public Carnivore() {
		
	}
	
	public Carnivore(String firstName) {
		super(firstName);
	}
	
	public Animal eat(Animal animal) {
		
		return animal;
	}
	
}
