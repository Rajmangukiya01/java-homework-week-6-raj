package javahomework;
//Write a Java program to print the area and perimeter of a rectangle
public class Program14 {
    public static void main(String[] args) {
        Program14 pro = new Program14();
        pro.size();
    }

    public void size() {
        double Width = 5.5;
        double Height = 8.5;
        double Area;
        double Perimeter;

        Area = Width * Height;
        System.out.println("Area is " + Area);
        Perimeter = 2 * (Width + Height);
        System.out.println("Perimeter is " + Perimeter);

    }
}
