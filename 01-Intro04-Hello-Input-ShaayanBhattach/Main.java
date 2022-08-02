import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What is your name?");
    String inp = input.nextLine();
    System.out.print("Hello " + inp + "!");


    System.out.print("How old are you?");
    String old = input.nextLine();
    int age = Integer.valueOf(old);
    int ageInMonths = age * 12;
    System.out.println("Your age in months is " + ageInMonths + ".");

    System.out.print("What is your favorite band?");
    String bandA = input.nextLine();
    System.out.print("What is your 2nd favorite band?");
    String bandB = input.nextLine();
    System.out.print("I like " + bandA + " and "+ bandB + " too!!!");



  }
}