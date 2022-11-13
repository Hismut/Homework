import java.util.Scanner;

public class Greeting {
public static void main(String[] args) {
Scanner scannerVariable = new Scanner(System.in);
System.out.println("What’s your name? >>>");
String word = scannerVariable.nextLine();
System.out.println("\nHello " + word);}
}

