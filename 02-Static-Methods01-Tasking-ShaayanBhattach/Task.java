
// name:
// purpose: experience the thrill of methods

public class Task 
{

	// method favorite(): returns ( ( ( (16 * 65 ) + 12 ) * 72 ) / 68 ) - 1
	public static int favorite() 
	{
		
		return ( ( ( (16 * 65 ) + 12 ) * 72 ) / 68 ) - 1; // change method body to produce correct answer
	}


	// method wasted(): prints line that is number of wasted gallons of water 
	public static void wasted( double r, int d ) 
	{
		final double dripsPerGallon = 15140.0;
    int water = (int)Math.round(((r) * 1440.0 * (d) / (dripsPerGallon)));

    System.out.println("A faucet with " + r +  " drips per minute over " + d +  " days will waste " + water + " gallons of water.");
    
	}

	// method count(): returns estimated number of beans in jar
	public static int count( double a, double b, int mL ) 
	{
		
		return (int)(mL / (5 * Math.PI * a * ((b * b) / 24))* 0.698); // change method body to produce correct answer
	}    
}
