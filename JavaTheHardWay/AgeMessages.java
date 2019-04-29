import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "You are: " ); if ( age < 13 ) {
    System.out.println( "\ttoo young to create a Facebook account" );
    }

    if ( age < 16 ) {
    System.out.println( "\ttoo young to get a driver's license" );
  } else {
    System.out.println("\tyou're old enough to drive");
  }

    if ( age < 18 ) {
        System.out.println( "\ttoo young to get a tattoo" );
    } else {
      System.out.println("\tyou are old enough to get a tattoo");
    }

    if ( age < 21 ) {
    System.out.println( "\ttoo young to drink alcohol" );
  } else {
    System.out.println("\tyou get to drink alcohol");
  }

    if ( age < 35 ) {
        System.out.println( "\ttoo young to run for President of the U.S." );
        System.out.println( "\t\t(How sad!)" );
    } else {
      System.out.println("\trun for president if you want ");
    }

    if ( age >= 65 ) {
      System.out.println("\told enough to retire");
    } else {
      System.out.println("\tat least you're not old enough to retire");
    }
  }
}
