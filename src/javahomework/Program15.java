package javahomework;
//Write a Java program to swap two variables
public class Program15 {
    public static void main(String[] args) {
        swap();
    }

    public static void swap() {
        int a = 10;
        int b = 20;

        System.out.println("Before swap");
        System.out.println("x : " + a);
        System.out.println("y : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap");
        System.out.println("x : " + a);
        System.out.println("y : " + b);
    }
}
