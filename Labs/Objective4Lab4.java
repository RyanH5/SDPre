import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int num;

    System.out.println("Please enter a number:");
    num = kb.nextInt();
    boolean isEven = num % 2 == 0;

    if (isEven) {
      System.out.println("The number is even");
    } else {
      System.out.println("The number is odd");
    }

  }
}
