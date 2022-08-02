import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) {  
		//create a world for your turtles
		World turtleWorld = new World(600, 800);
		
		//create your first turtle
		Turtle deb = new Turtle(turtleWorld);
		Turtle tim = new Turtle(50, 50, turtleWorld);
    // x = 50, y = 50 is the starting point
		//move the turtled forward
    //deb.forward();
    //deb.forward(200);
    //.foward() automatically moves 100 pixels (without input) and .foward(200) moves 100 pixels.
    //deb.turnLeft();
    //deb.turnRight();
    //turnLef() turns -90 degrees, turnRight() turns +90 degrees..
    // deb.turnRight();
    // deb.forward(100);
    // deb.turnLeft();
    // deb.forward(100);
    // deb.turnLeft();
    // deb.forward(100);
    // deb.turnLeft();
    // deb.forward(100);
    tim.Triangle(100);

    // tim.turnRight();
    // tim.forward(100);
    // tim.turn(120);
    // tim.forward(100);
    // tim.turn(120);
    // tim.forward(100);
    // tim.turn(120);
    deb.Square(100);
    // we don't need static because they are instances of a class.
    //the type is a void because there is no returm
    Turtle joe = new Turtle(300,150, turtleWorld);
    tim = joe;
    joe.forward();
    //if joe moves, then tim moves also
    joe.Triangle(200 );
    
    //Turtle and picture - does not work
    deb.shape(5,75);
    //

  }


  public static void delaySeconds(int d)
  {
    try {
      TimeUnit.SECONDS.sleep(d);
    }
    catch(InterruptedException exception) {
            // Output expected InterruptedExceptions.
            System.out.println("Exception: "+exception);
        } catch (Exception exception) {
            // Output unexpected Exceptions.
            System.out.println("Exception: "+exception+", "+false);
        }
  }


}
