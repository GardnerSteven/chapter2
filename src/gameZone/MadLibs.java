package gameZone;

import java.util.Scanner;

public class MadLibs 
{

	public static void main(String[] args) 
	{
	String color;
	String wordEst;
	String bodyPartPlural;
	String anAnimal;
	String aNoun;
	String PluralNoun;
	
	
	
	
	int a, b, c;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a color >>");
	color = input.nextLine();
	System.out.print("Enter a word ending in est >>");
	wordEst = input.nextLine();
	System.out.print("Enter a plural body part >>");
	bodyPartPlural = input.nextLine();
	System.out.print("Enter an animal >>");
	anAnimal = input.nextLine();
	System.out.print("Enter a noun >>");
	aNoun = input.nextLine();
	System.out.print("Enter a plural noun >>");
	PluralNoun = input.nextLine();
	
	System.out.print("Enter a number>> ");
	a = input.nextInt();
	System.out.print("Enter a number>> ");
	b = input.nextInt();
	System.out.print("Enter a number>> ");
	c = input.nextInt();
	
    c = a - b;
    
    System.out.println("The  " + color +" "+ anAnimal + " was different from all the other zoo animals because he ate "
    		+ PluralNoun + " and people didnt like that so all the zoo workers got together at " + aNoun + " and were on command to attack him so they counted "
    		 + a +", "+ b +", "+ c +", and they killed the tiger, and they all looked at there " + bodyPartPlural + " ,and from then all they declaired him the "
    		  + wordEst + " " + anAnimal + " there ever was.");
	}

}
