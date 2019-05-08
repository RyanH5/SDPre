import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double num1, num2, sum;

    System.out.println("Please enter a number: ");
    num1 = kb.nextDouble();

    System.out.println("Please enter another number:");
    num2 = kb.nextDouble();
    sum = num1 + num2;

    System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);

  }
}
