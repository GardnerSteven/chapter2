package excersises;

import java.util.Scanner;

public class InchesToFeet 
{

	public static void main(String[] args) 
	{
		final int inchesInFeet = 12;
		
		int inchesNeeded = 86;
		int feetNeeded = 7;
		int extraInches = 2;
		
		feetNeeded = inchesNeeded /inchesInFeet;
		extraInches = inchesNeeded % inchesInFeet;
		
		System.out.println("You have " + feetNeeded + " feet and " + extraInches + " inches left over.");
		

	}

}
