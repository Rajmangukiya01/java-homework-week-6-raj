package javahomework;

import java.util.Scanner;
/* Write a program to insert any temperature value in degree Fahrenheit and
    convert to degree Celsius */
public class Program7 {
    public static void main(String[] args) {
        value();
    }

    public static void value() {
        double fah;
        double cel;

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter degree Fahrenheit : ");
        fah = sca.nextDouble();

        cel = ((fah - 32) * 5 / 9);
        System.out.println("degree celsius = " + cel);
        sca.close();

    }
}
