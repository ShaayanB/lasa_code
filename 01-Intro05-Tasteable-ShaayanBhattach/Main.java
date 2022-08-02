// REPL.IT requires the root class be named "Main".  Normally you'd call this class
// something more descriptive such as Tasteable.
import java.util.Scanner;
public class Main
{
   // method main(): program starting point
   public static void main( String[] args ) 

  

   {
      // set up input scanner
      Scanner input = new Scanner(System.in);
      
      // get input
      System.out.println("Enter the shelf life:");
      String shelf = input.nextLine();

      // compute tasteable age
      int life = Integer.valueOf(shelf);
      int result = (life / 2) + 7;

      // display result
      System.out.println(shelf + " week shelf life tastes best when it is at least " + result + " weeks old");
   }
}