package javahomework;
/* Write a Java program that takes three numbers as input to calculate and
        print the average of the numbers */
import java.util.Scanner;

public class Program13 {
    static double a, b, c, result;

    public static void main(String[] args) {
        ave();
    }

    public static void ave() {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter three values : ");
        a = xyz.nextDouble();
        b = xyz.nextDouble();
        c = xyz.nextDouble();

        result = (a + b + c) / 3;
        System.out.println("Average = " + result);
        xyz.close();

    }

}
