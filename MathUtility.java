public class MathUtility {
    
    public static int square(int x) {
        return x * x;
    }

    
    public static int cube(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Square of " + num + " is: " + MathUtility.square(num));
        System.out.println("Cube of " + num + " is: " + MathUtility.cube(num));
    }
}