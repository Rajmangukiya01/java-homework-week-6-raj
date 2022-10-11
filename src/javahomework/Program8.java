package javahomework;

import java.util.Scanner;
//Write a program to calculate the area of a triangle

public class Program8 {
    public static void main(String[] args) {
        Program8 pro = new Program8();
        pro.myResult();
    }

    public void myResult() {
        double b;
        double h;
        double Area;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of b : ");
        b = scan.nextDouble();
        System.out.println("Enter the value of h : ");
        h = scan.nextDouble();
        Area = (b * h) / 2;
        System.out.println("Area of triangle = " + Area);
        scan.close();
    }

}
