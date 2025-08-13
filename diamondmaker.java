import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(5);
    World.setSize(9, 10);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(9,5,West,1000);
		
    // examples of commands you can invoke on a Robot
    r.putBeeper();
    for (int i = 0; i < 4; i++) {

        for (int n = 0; n < 4; n++) {
          r.move();
          r.turnLeft();
          r.move();
          r.putBeeper();
          r.turnLeft();
          r.turnLeft();
          r.turnLeft();
        }
        r.turnLeft();
  
    }
    
  }

}