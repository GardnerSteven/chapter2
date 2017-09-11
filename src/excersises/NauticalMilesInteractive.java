package excersises;

import java.util.Scanner;

public class NauticalMilesInteractive 
{

	public static void main(String[] args) 
	{
	final double kmInNMi =1.852;
	final double miInNMi = 1.150779;
	
	double kmNeeded;
	double miNeeded;
	double miNMiNeeded;
	double kmNMiNeeded;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter kilometers needed>>>");
	kmNeeded = input.nextInt();
	System.out.println("Enter miles needed>>>");
	miNeeded = input.nextInt();
	kmNMiNeeded = kmNeeded / kmInNMi;
	miNMiNeeded = miNeeded / miInNMi;
	
	System.out.println("You have " + kmNMiNeeded + " nautical miles from kilometers and you have " + miNMiNeeded + " nautical miles from miles.");
	
	}

}
