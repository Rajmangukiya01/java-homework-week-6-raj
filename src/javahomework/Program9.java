package javahomework;

import java.util.Scanner;
//Write a program to convert the upper case to lower case
public class Program9 {
    public static void main(String[] args) {
        words();
    }

    public static void words() {
        String upperCase;
        String lowerCase;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upper case letters : ");
        upperCase = scanner.nextLine();

        lowerCase = upperCase.toLowerCase();
        System.out.println("Result = " + lowerCase);
        scanner.close();
    }
}
