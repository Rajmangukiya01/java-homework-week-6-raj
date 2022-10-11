package javahomework;

import java.util.Scanner;
//Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).


public class Program6 {
    static double pi = 3.14;
    static double r;
    static double A;

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of r : ");
        r = scanner.nextDouble();
        A = pi * r * r;
        System.out.println("Area of circle = " + A);
        scanner.close();
    }
}
