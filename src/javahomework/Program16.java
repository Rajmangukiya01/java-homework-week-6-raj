package javahomework;

import java.util.Scanner;

//Write a Java program to add two binary numbers
public class Program16 {
    public static void main(String[] args) {
        long binary1;
        long binary2;
        int i = 0, reminder = 0;
        int[] sum = new int[20];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first binary number : ");
        binary1 = scan.nextLong();
        System.out.println("Enter second binary number : ");
        binary2 = scan.nextLong();

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + reminder) % 2);
            reminder = (int) ((binary1 % 10 + binary2 % 10 + reminder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (reminder != 0) {
            sum[i++] = reminder;
        }
        --i;
        System.out.println("Sum of two binary numbers : ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.println("\n");


    }


}
