package excersises;

import java.util.Scanner;

public class InchesToFeetInteractive 
{

	public static void main(String[] args) 
	{
		final int inchesInFeet = 12;
		
		int inchesNeeded;
		int feetNeeded;
		int extraInches;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter inches needed>>>");
		inchesNeeded = input.nextInt();
		
		feetNeeded = inchesNeeded /inchesInFeet;
		extraInches = inchesNeeded % inchesInFeet;
		
		System.out.println("You have " + feetNeeded + " feet and " + extraInches + " inches left over.");
		

	}

}
