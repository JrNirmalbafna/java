import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;


    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sc.nextDouble();
        System.out.println("Enter width: ");
        width = sc.nextDouble();
    }

    public void display() {
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setData();
        r.display();
    }
}

