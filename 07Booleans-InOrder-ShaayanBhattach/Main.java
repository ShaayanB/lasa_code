import java.util.*;

public class Main
{
	// main(): program starting point
	public static void main( String[] args ) 
	{
		// set up scanner to read input from user
		Scanner input = new Scanner(System.in);
		
		// prompt the user for input
		System.out.println( "Enter x, y, and z:" );
		
    int input1 = input.nextInt();
    int input2 = input.nextInt();
		int input3 = input.nextInt();
    // create InOrder object by calling the initialization constructor
    InOrder o1 = new InOrder(input1, input2, input3);
		System.out.println(o1.makeInOrder());
		
		// call the method in InOrder you created to determine whether the numbers 
		//were in order. Remember to put the method call inside a print statement
		
    }
}