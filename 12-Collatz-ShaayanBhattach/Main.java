// Test you Collatz object
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("What is the start number for collatz?");
        int start = scan.nextInt();
        if (start > 0) {
            //unit test does not print the start
            //System.out.println("Starting Number " + start);
            System.out.print("Starting Number ");
            Collatz collatz = new Collatz(start);
            System.out.println(collatz.toString());
            System.out.println("Number of steps " + collatz.steps());
            System.out.println("Maximum value " + collatz.maxValue());
            System.out.println("Minimum odd value " + collatz.minOddValue());
            int[] oddValues = collatz.oddValues();
            System.out.println("Odd values " + Arrays.toString(oddValues));
            System.out.println("Sum of all values " + collatz.sumValues());
            int[] sequence = collatz.sequence();
            for (int i = 0; i < sequence.length; i++)
                System.out.printf("step %d %d\n", i + 1, sequence[i]);
        }
        else{
            System.out.println("Number of steps should be a positive number");
        }

    }
}
