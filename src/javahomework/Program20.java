package javahomework;
//Write a Java Program to print as below

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        table();
    }

    public static void table() {
        double a;
        double b = 2.089;
        double c;
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter Gallons : ");
        a = xyz.nextDouble();
        c = a * b;

        System.out.println("\"+------------------------+\" ");
        System.out.println("\"|                        |\" ");
        System.out.println("\"|      CORNER STORE      |\" ");
        System.out.println("\"|                        |\" ");
        System.out.println("\"|   2015-03-29 04:38PM   |\" ");
        System.out.println("\"|                        |\" ");
        System.out.println("\"|  Gallons :  " + a + "      |\" ");
        System.out.println("\"|  Price :  " + b + "        |\" ");
        System.out.println("\"|                        |\" ");
        System.out.println("\"| Fuel total : " + c + "  |\" ");
        System.out.println("\"|                        |\" ");
        System.out.println("\"+------------------------+\" ");
        xyz.close();

    }


}
