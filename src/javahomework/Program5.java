package javahomework;

import java.util.Scanner;

/*Write a program for a calculator with addition, subtraction, multiplication
*and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)*/
public class Program5 {
    public static void main(String[] args) {
        add();
        sum();
        Program5 obj = new Program5();
        obj.multiplication();
        obj.division();
    }

    public static void add() {
        int x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        x = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        y = scanner.nextInt();
        z = x + y;
        System.out.println("Addition of two number = " + z);
    }

    public static void sum() {
        int xx, yy, zz;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        xx = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        yy = scanner.nextInt();
        zz = xx - yy;
        System.out.println("Subtraction of two number = " + zz);
    }

    public void multiplication() {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        a = scanner.nextInt();
        System.out.println("Enter Second number : ");
        b = scanner.nextInt();
        c = a * b;
        System.out.println("Multiplication of two number = " + c);
    }

    public void division() {
        int aa, bb, cc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        aa = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        bb = scanner.nextInt();
        cc = aa / bb;
        System.out.println("Division of two number = " + cc);
    }

}
