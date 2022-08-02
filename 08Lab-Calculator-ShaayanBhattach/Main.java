import java.util.Scanner;

public class Main //CalculatorRunner
{
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        char operator;
        int validOrNot = 0;
        //instantiate a Scanner
        Scanner newScan = new Scanner(System.in);

        //prompt the user for the operator (how do you read in a character?)
        System.out.println("Enter the operator:");

        //assign the input from the user to operator variable
        operator = newScan.next().charAt(0);

        //setup a set of conditions below to determine if the operator is valid
        if ((operator == '+') || (operator == '-') || (operator == '*') || (operator == '/')) {
            validOrNot = 1;
        } else {
            System.out.println("That is not a valid operator");
        }
        //get the remaining inputs from the user
        if (validOrNot == 1) {
            System.out.println("Enter the first operand:");
            num1 = newScan.nextDouble();
            System.out.println("Enter the second operand:");
            num2 = newScan.nextDouble();
            if ((num2 == 0) && (operator == '/')) {
                validOrNot = 0;

            }
            if (validOrNot == 0) {
                System.out.print("Cannot Divide by Zero");
            } else {
                Calculator Calc = new Calculator(num1, num2, operator, validOrNot);
                Calc.calculate();
                //call the toString() method to print the results
                System.out.println(Calc.toString());
            }

        }
    }
}