//import Scanner
import java.util.Scanner;
public class Main
{
	//main method
	public static void main(String[] args)
	{
		//instantiate Scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user for numerator
		System.out.println("Enter the numerator:");
		
		//assign user input to variable
		int numValue = input.nextInt();
		
		//prompt user for denominator
		System.out.println("Enter the denominator:");
		
		//assign user input to variable
		int demValue = input.nextInt();
		
		//instantiate GCD object
    GCD GCD1 = new GCD(numValue,demValue);		
		//call toString() method
		System.out.println(GCD1.toString());
		//print fraction in lowest term
		System.out.println("The fraction in lowest terms is " + GCD1.lowestNum() + "/" + GCD1.lowestDem());
	}
}