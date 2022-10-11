package javahomework;
/* Write a Java program to print the sum (addition), multiply, subtract, divide and
   remainder of two numbers */
public class Program18 {
    int a = 125;
    int b = 24;

    public static void main(String[] args) {
        Program18 pro = new Program18();
        pro.sum();
    }

    public void sum() {
        System.out.println("125 + 24 = " + (a + b));
        System.out.println("125 - 24 = " + (a - b));
        System.out.println("125 * 24 = " + (a * b));
        System.out.println("125 / 24 = " + (a / b));
        System.out.println("125 % 24 = " + (a % b));

    }
}
