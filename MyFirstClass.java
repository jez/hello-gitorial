import java.util.Scanner;

public class MyFirstClass {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
    System.out.println("Do you want to say something to the Java world!");
    Scanner scan = new Scanner(System.in);
    String greeting = scan.nextLine();
    System.out.println(">>> You said: " + greeting);
    System.out.println("Thanks! It's great to meet you!");
  }
}
