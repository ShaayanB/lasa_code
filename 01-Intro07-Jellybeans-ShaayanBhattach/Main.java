// Try to write the WHOLE program. See if you can define the class and 
// main method from memory.  Remember repl.it requires the class containing
// the main method to be named Main.
import java.util.Scanner;
public class Main{
  public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter jelly bean length (cm):");
    double length = input.nextDouble();

    System.out.println("Enter jelly bean height (cm):");
    double height = input.nextDouble();

    System.out.println("Enter jar size (mL):");
    int jarSize = input.nextInt();

    System.out.println("Estimate for number of jelly beans with average");
    System.out.println("length: " + length + " cm");
    System.out.println("height: " + height + " cm");
    System.out.println("in a jar of size " + jarSize + " mL is");
    System.out.println(volume(length, height, jarSize));
  }

  public static int volume(double length, double height, int jarSize){
    return (int)(jarSize / (5 * Math.PI * length * ((height * height) / 24))* 0.698);




  }
}