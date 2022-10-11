package javahomework;

public class Program3 {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Program3 abc = new Program3();
        abc.myJob();
        myStudy();

    }

    public void myJob() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void myStudy() {
        Program3 obj = new Program3();
        System.out.println(obj.a);
        System.out.println(b);

    }
}
