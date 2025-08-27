import java.util.Scanner;  //may be necessary for input

import javax.swing.JOptionPane;  //may be necessary for input

import kareltherobot.*;

public class Driver implements Directions {
// declared here so it is visible in all the methods!! 
// It will be assigned a value in the getInfo method
	private static Robot roomba; 


	// You will add very many variables!!
	// variables to print
	int roomArea = 0;
	int numPiles = 0;
	int largestPile = 0;
	double avgPileSIZE = 0;
	double percentDirty = 0;
	int numBeepers = 0;

	//variables for calculation
	

	
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		Driver d = new Driver();

  /**
	 * This section of code gets info from the user in the following order: 1. Ask the user
	 * which world file they wish to process. Right now, that world file name is
	 * hardcoded in. 2. Ask the user for the starting location and direction of the
	 * Robot. A new Robot should be constructed and assigned to the global
	 * (instance) variable named roomba that is declared on line 10.
	 * 
	 * An inelegant way to interact with the user is via the console, using
	 * System.out.println and a Scanner that scans System.in (input from the
	 * console). A more elegant way to get user input might include using a
	 * JOptionPane.
	 */

    String wrldName = "basicRoom.wld";

		World.readWorld(wrldName);
    	World.setVisible(true);
		Robot r = new Robot (7,6,East,0); //set robot location, direction, and # of beepers
	

    


	/** This section will have all the logic that takes the Robot to every location 
	 * and cleans up all piles of beepers.  Think about ways you can break this
	 * large, complex task into smaller, easier to solve problems.
	 */

		// the line below causes a null pointer exception
		// what is that and why are we getting it?

		// movement

		for (;;)
		{
			if (r.frontIsClear() == false && r.facingEast() == true)
			{
				r.turnLeft();
				r.move();
				r.turnLeft();
			}	
			else
			{
				r.move();
			}

			if (r.frontIsClear() == false && r.facingWest() == true)
			{
				for (int countTurn = 0; i <= 3; i++)
				{
					r.turnLeft();
				}
				r.move();
				for (int countTurn = 0; i <= 3; i++)
				{
					r.turnLeft();
				}
			}
			else
			{
				r.move();
			}
		}

		//variable counters
		while (r.nextToABeeper() == true)
		{
			r.pickBeeper();
			int numBeepers= numBeepers + 1;
		}

	





  	/** This method displays the results of cleaning the room.  All of the info
	 * in the pdf that describes the problem need to be displayed.  You can present
	 * this info in the console (boring) or you can present using JOptionPane (cool!)
	 */

    System.out.println("The biggest pile was ");
	System.out.println("Number of piles was");
	System.out.println("Total number of beepers was ");
	System.out.println("Average pile size ");
	System.out.println("Area of room was ");
	System.out.println("Location of the largest pile ");
	System.out.println("Percent dirty was ");







  }

}
