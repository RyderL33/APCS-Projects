	import java.util.Scanner;  //may be necessary for input

	import javax.swing.JOptionPane;  //may be necessary for input

	import kareltherobot.*;

	public class Driver implements Directions {
	// declared here so it is visible in all the methods!! 
	// It will be assigned a value in the getInfo method
		private static Robot roomba; 


		// You will add very many variables!!
		

		
		public static void main(String[] args) {
			// LEAVE THIS ALONE!!!!!!
			Driver d = new Driver();

		// variables for calculation or print
		int roomArea = 0;
		int numPiles = 1;
		int largestPile = 0;
			int pileBeepers = 0;
		double avgPileSIZE = 0;
		double percentDirty = 0;
			int numTilesTotal = 1;
			int numTilesEmpty = 0;
			// to find % dirty, take numTilesDirty divided by numTilesTotal
		int numBeepers = 0;
		int largestPileX = 0; // x is avenue
		int largestPileY = 0; // y is street



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
			Robot r = new Robot (7,6,East,100); //set robot location, direction, and # of beepers
			World.setDelay(2);

		


		/** This section will have all the logic that takes the Robot to every location 
		 * and cleans up all piles of beepers.  Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

			// the line below causes a null pointer exception
			// what is that and why are we getting it?


		// at start of program, get the room size (num of rows and columns)
		for (;;)
		{
			if (r.nextToABeeper() == true)
			{
				numPiles++;
				while (r.nextToABeeper() == true)
					{
						r.pickBeeper();
						numBeepers++;
						pileBeepers++;
						if (pileBeepers > largestPile)
							{
								largestPile = pileBeepers;
								largestPileX = r.avenue();
								largestPileY = r.street();
							}
					}
			}
			pileBeepers = 0;
			while (r.nextToABeeper() == false && r.frontIsClear() == true)
				{
					numTilesEmpty++;
					r.move();
					numTilesTotal++;
				}

			
			if (r.frontIsClear() == false && r.facingEast() == true)
				{
					r.turnLeft();
					if (r.facingNorth() == true && r.frontIsClear() == false) // check to make sure you aren't hitting wall, if you are print values and end loop
						{
							System.out.println("The biggest pile was " + largestPile);
							System.out.println("Number of piles was " + numPiles);
							System.out.println("Total number of beepers was " + numBeepers);
							System.out.println("Average pile size " + (double) numBeepers/numPiles);
							System.out.println("Area of room was " + numTilesTotal);
							System.out.print("Location of the largest pile ( " + largestPileX);   // print location of largest pile
							System.out.print(" , " + largestPileY);
							System.out.println(" )");
							System.out.print("Percent dirty was " + ((double) numPiles/numTilesTotal) * (100));
							System.out.println("%");
							break;
						}
					r.move();
					numTilesTotal++;
					r.turnLeft();
				}	

			if (r.frontIsClear() == false && r.facingWest() == true)
				{
					for (int a = 0; a < 3; a++)
						{
							r.turnLeft();
						}
					if (r.facingNorth() == true && r.frontIsClear() == false) // check to make sure you aren't hitting wall, if you are print values and end loop
						{
							System.out.println("The biggest pile was " + largestPile);
							System.out.println("Number of piles was " + numPiles);
							System.out.println("Total number of beepers was " + numBeepers);
							System.out.println("Average pile size " + (double) numBeepers/numPiles);
							System.out.println("Area of room was " + numTilesTotal);
							System.out.print("Location of the largest pile ( " + largestPileX);   // print location of largest pile
							System.out.print(" , " + largestPileY);
							System.out.println(" )");
							System.out.print("Percent dirty was " + ((double) numPiles/numTilesTotal) * (100));
							System.out.println("%");
							break;
						}
					r.move();
					numTilesTotal++;
					for (int b = 0; b < 3; b++)
						{
							r.turnLeft();
						}
				}
		}

				
			

				




		/** This method displays the results of cleaning the room.  All of the info
		 * in the pdf that describes the problem need to be displayed.  You can present
		 * this info in the console (boring) or you can present using JOptionPane (cool!)
		 */

		// System.out.println("The biggest pile was " + largestPile);
		// System.out.println("Number of piles was" + (numTilesTotal - numTilesEmpty));
		// System.out.println("Total number of beepers was " + numBeepers);
		// System.out.println("Average pile size " + (double) numBeepers/(numTilesTotal - numTilesEmpty));
		// System.out.println("Area of room was " numTilesTotal);
		// System.out.println("Location of the largest pile ");
		// System.out.println("Percent dirty was " + (double) numTilesEmpty/numTilesTotal);







	}

	}		
