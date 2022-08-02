// REPL.IT requires the root class be named "Main".  Normally you'd call this class
// something more descriptive such as Pages.
import java.util.Scanner;
public class Main 
{
   // main(): program starting point
   public static void main( String[] args ) 
   {
      // set up input scanner
      Scanner input = new Scanner(System.in);
      // get the age
      System.out.println("Enter your age:");
      String inp = input.nextLine();
      int age = Integer.valueOf(inp);
      System.out.println(age + " year olds should read at least " + pages(age) + " pages before giving up on a book");
      // call the pages method to compute the number of pages to be read
      
      // display result (pages to be read)
      
   }
   
   public static int pages(int usersAge) {
     return (100-usersAge);

   }
}