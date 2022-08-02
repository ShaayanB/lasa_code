// Try to write the WHOLE program. See if you can define the class and 
// main method from memory.  Remember repl.it requires the class containing
// the main method to be named Main.
import java.util.Scanner;
class Main {
  public static void main(String[] args)
  {
    final double dripsPerGallon = 15140.0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter faucet drips per minute:");
    double dripsPerMinute = input.nextFloat();
    System.out.println("Enter number of days:");
    int numOfDays = input.nextInt();

    System.out.println("A faucet with " + dripsPerMinute + " drips per minute over " + numOfDays + " days will waste " + faucet(dripsPerMinute,numOfDays) + " gallons of water");
  
  }
  public static double faucet(double drips_per_minute, double days){
    final double dripsPerGallon = 15140.0;
    return ((drips_per_minute) * 1440.0 * (days)) / (dripsPerGallon);
    

  }
}
