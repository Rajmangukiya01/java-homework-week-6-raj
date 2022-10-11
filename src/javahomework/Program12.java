package javahomework;
//Write a Java program to compute the specified expressions and print the output
public class Program12 {

    public static void main(String[] args) {
        Program12 program12 = new Program12();
        program12.myResult();
    }

    public void myResult() {
        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        double result;
        result = ((a * b - b * b) / (c - d));
        System.out.println(result);
    }
}
