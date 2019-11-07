package com.selfstudy.mainapp;

public class Animal {

	private String firstName;

	public Animal(String firstName) {
		super();
		this.firstName = firstName;
	}

	public Animal() {
		super();
	}

	@Override
	public String toString() {
		return "Animal [firstName=" + firstName + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public void eat(int food) {
		System.out.println("I ate " + food + " lbs of food.");
	}
	
	public void makeNoise() {
		System.out.println("I am a " + this.getClass().getSimpleName());
	}
	
}
