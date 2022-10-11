package javahomework;
//Write a Java program to display the java pattern
public class Program11 {
    public static void main(String[] args) {
        myFourthMethod();

    }

    public void myMethod() {
        System.out.println("J a v v a");
    }

    public static void mySecondMethod() {
        Program11 program11 = new Program11();
        program11.myMethod();
        System.out.println("J a a v v a a");

    }

    public void myThirdMethod() {
        mySecondMethod();
        System.out.println("J J aaaaa V V aaaaa ");
    }

    public static void myFourthMethod() {
        Program11 obj = new Program11();
        obj.myThirdMethod();
        System.out.println("J J a a V a a");
    }


}
