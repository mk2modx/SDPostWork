package com.selfstudy.mainapp;

public class Sanctuary {
	
	// fields
	private Attendant attendant;
	
	private Animal [] animals;
	private int currentAnimalIndex;
	private static final int DEFAULT_SIZE = 10;
	//methods
	
	
	public Sanctuary(Attendant attendant) {
		this.attendant = attendant;  // assigns attendant in the field
	}
	
	public Sanctuary(Attendant attendant, int currentAnimalIndex) {
		this.attendant = attendant;
		this.currentAnimalIndex = currentAnimalIndex;
	}
	
	public Sanctuary(Animal[] animals, Attendant attendant) {
		this.animals = animals;
		this.attendant = attendant;
	}

	public void addAnimal(Animal animal) {
	if(this.animals == null) {
		this.animals = new Animal[DEFAULT_SIZE];
	}
		for(int i = 0; i < animals.length; i++) {
			if (animals[i] == null)  {
				animals[i] = animal;
				break;
			}
		}
	}
	
	public void startAttendantRounds() {
	this.attendant.doRounds(animals);	
	}

	public Attendant getAttendant() {
		return attendant;
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

	public int getCurrentAnimalIndex() {
		return currentAnimalIndex;
	}

	public void setCurrentAnimalIndex(int currentAnimalIndex) {
		this.currentAnimalIndex = currentAnimalIndex;
	}
	
}
