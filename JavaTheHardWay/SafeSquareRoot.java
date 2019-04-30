import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String ready = "YES";

    System.out.print("Are you ready? ");
    String response = keyboard.next().toUpperCase();

    while (!response.equals(ready)) {
      System.out.print("I can't hear you? ");
      System.out.print("Are you ready? ");
      response = keyboard.next().toUpperCase();
    }

    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.print("(No negatives, please.) ");
    x = keyboard.nextDouble();

    while (x < 0) {
      System.out.println("I won't take negative numbers");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + "is " + y);
  }
}
