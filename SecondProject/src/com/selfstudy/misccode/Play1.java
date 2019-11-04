package com.selfstudy.misccode;

public class Play1 {

	public static void main(String[] args) {
		
		boolean isRaining = false;
		
		if(isRaining == true) {
			takeUmbrella();
		}
		
		boolean doesBathe = false;
		int popularityLevel = 100;
		
		if (doesBathe == false) {
			popularityLevel = 0;
		}

		boolean shoutingAtHorse = false;
		
		if (shoutingAtHorse) {
			haveBadDay();
		}
		
	}
	
	

	private static void haveBadDay() {
		System.out.println("Having a Bad Day");
	}



	private static void takeUmbrella() {
System.out.println("Taking Umbrella");	
	}
	
	
}
