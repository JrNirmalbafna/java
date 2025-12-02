package app;

// Import a specific class from a user-defined package
import utilis.MathUtils;

public class Math {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;

        int s = MathUtils.square(x);
        int sum = MathUtils.add(x, y);

        System.out.println("Square of " + x + " = " + s);
        System.out.println("Sum = " + sum);
    }
}