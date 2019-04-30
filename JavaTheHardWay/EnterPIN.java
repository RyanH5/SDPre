import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, attempt;

    password = "hello";
    pin = 12345;

    System.out.println("BEFORE YOU MAY PROCEED TO THE JAVA BANK, ");
    System.out.print("ENTER YOUR PASSWORD: ");
    attempt = keyboard.next();

    while (! password.equals(attempt)) {
      System.out.println("\nINCORRECT PASSSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
      attempt = keyboard.next();
    }

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();


    while (entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED.  YOUR ACCOUNT BALANCE IS $425.17");
  }
}
