import java.util.Scanner;

public class RunningTotal {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int total = 0, current;

    System.out.print("Type in a bunch of values and I'll add them up. ");
    System.out.println("I'll stop when you type a zero.");
    current = keyboard.nextInt();

    do {
      System.out.print("Value: ");
      total += current;
      if (current != 0) {
        System.out.println("The total so far is: " + total);
      }
      current = keyboard.nextInt();

    } while ( current != 0 );

    System.out.println("The final total is: " + total);
  }
}
