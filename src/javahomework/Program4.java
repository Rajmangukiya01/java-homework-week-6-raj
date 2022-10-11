package javahomework;

public class Program4 {
    int a = 10;
    int b = 20;
    static String x = "Raj";
    static String y = "Mangukiya";

    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.mySchool();
        myHome();
    }

    public void mySchool() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }

    public static void myHome() {
        Program4 program4 = new Program4();
        System.out.println(program4.a);
        System.out.println(program4.b);
        System.out.println(x);
        System.out.println(y);

    }
}
