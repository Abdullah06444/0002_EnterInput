package Beginner;

import java.util.Scanner;

public class Java0002_EnterInput {

    public static void main(String[] args) {

        System.out.println("Type something to the command line: ");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println("Welcome to the Java programming language.");
        System.out.println("You were writing "+input+" to the command line. :D");
    }
}
// Java string karakterlerimizde turkce kullanmamiza izin veriyor.