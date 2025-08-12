import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(1);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(2,9,West,1000);
		
    // examples of commands you can invoke on a Robot
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft(); // bottom of L in the corner, to turn right
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft(); // finished L, heading to start the R
    r.move();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft(); // finished top part of R
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft(); // end of long straight on right side of R
    r.move();
    r.move();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.move();
	r.turnLeft();
	r.move();
	r.putBeeper();
	r.move();
	r.turnLeft();
	r.turnLeft();
	r.turnLeft();
	r.move();
	r.putBeeper(); // end of diagonal on R
	r.move();
	r.putBeeper();
	r.turnLeft(3);
	r.move();
	r.putBeeper();
	r.move();
	r.putBeeper();
	r.turnLeft(); // end of bottom part of R curve in middle
	r.move();
	r.putBeeper();
	r.move();
	r.putBeeper();
  }

}
