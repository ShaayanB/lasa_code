//import Scanner
import java.util.Scanner;
// DealRunner
public class Main
{
	public static void main(String[] args)
	{
		//instantiate Scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt the user for the number of simulations to run
		System.out.println("How many simulations do you want to run?");
		
		//assign input to variable
		int simNumber = input.nextInt();
		
		//declare variables to store stopping condition for loop, prize loc, user guess,
		  //door revealed, the new guess, and wins by changing
		
		
		//loop through the number of simulations
    int numWins = 0;
  	for (int i = 0; i < simNumber; i++)
    {
		
			//instantiate a Deal object inside the loop
			Deal newDeal = new Deal();
			
			//get the user's guess and assign to a variable 
			int userGuess = newDeal.accessGuess();
			
			//get the prize location and assign to a variable
			int prizeLoc = newDeal.accessLoc();
			
			//get the door which is revealed and assign to a variable
			int doorReveal = newDeal.doorReveal();
			
			//get the new guess and assign to a variable
			int newGuess = newDeal.newGuess();
			
			//increment counter for loop
			
			
			//determine if the new guess matches the prize location
			boolean switching = false;
      if (newGuess == prizeLoc){
			
			//increment the win count by changing
				numWins++;
				switching = true;
      }
			//output the variables for each simulation
			System.out.println("prize:" + prizeLoc + " " + "guess:" + userGuess + " " + "revealed:" + doorReveal + " " + "new guess:" + newGuess + " " + "win if switching:" + switching + " " + "if not switching:" + !switching);
    }
    	//output the probability of winning/not winning by switching
		System.out.println("Probability of winning if you don't switch = " + (1.00-((double)numWins/simNumber)));
    System.out.println("Probability of winning if you switch = " + (double)numWins/simNumber);

    input.close();
	}
  
}