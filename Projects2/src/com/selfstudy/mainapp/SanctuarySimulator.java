package com.selfstudy.mainapp;

import java.util.Scanner;

public class SanctuarySimulator {

	private Attendant attendant;
	
	private Sanctuary sanc;
	
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		SanctuarySimulator sm = new SanctuarySimulator();
		System.out.println("Welcome to the Animal Sanctuary!!");
		
		sm.run();
		
		
	}
	
	public SanctuarySimulator() {
		
	}
	
	public void run() {
	
		Attendant jack = new Attendant();
		sanc = new Sanctuary(jack, 10);
		Girrafe g = new Girrafe("Dobby");
		sanc.addAnimal(g);
		sanc.addAnimal(new Elephant("Babar"));
		sanc.addAnimal(new Lion("Tony"));
		sanc.addAnimal(new Hippo("HipHop"));

		System.out.println("Would you like to do your rounds ? Y/N ");
		String rounds = kb.next();
		
		if (rounds.equalsIgnoreCase("Y")) {
			jack.doRounds(sanc.getAnimals());
		}
		
	}
	
}
