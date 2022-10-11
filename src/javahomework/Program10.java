package javahomework;

import java.util.Scanner;
/* Write a Java program that takes a number as input and prints its
  multiplication table up to 10 */
public class Program10 {
    public static void main(String[] args) {
        Program10 program10 = new Program10();
        program10.table();
    }

    public void table() {
        int x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        x = scanner.nextInt();
        System.out.println(x + "*1 =" + x * 1);
        System.out.println(x + "*2 =" + x * 2);
        System.out.println(x + "*3 =" + x * 3);
        System.out.println(x + "*4 =" + x * 4);
        System.out.println(x + "*5 =" + x * 5);
        System.out.println(x + "*6 =" + x * 6);
        System.out.println(x + "*7 =" + x * 7);
        System.out.println(x + "*8 =" + x * 8);
        System.out.println(x + "*9 =" + x * 9);
        System.out.println(x + "*10 =" + x * 10);
        scanner.close();

    }
}
