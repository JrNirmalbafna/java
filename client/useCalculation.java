package client;

import mathpack.Calculation;

public class useCalculation {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        int a = 12, b = 15;
        System.out.println("Add: " + calc.add(a, b));
        System.out.println("Subtract: " + calc.subtract(a, b));
        System.out.println("Multiply: " + calc.multiply(a, b));
    }
}