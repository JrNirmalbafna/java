public class Math {
	public static void main(String[] args) {
		double number = 79.0;
		double squareRoot = java.lang.Math.sqrt(number);
		System.out.println("Square root of " + number + " is: " + squareRoot);
		double  base = 4.0;
		double exponent = 5.0;
		double powerResult = java.lang.Math.pow(base, exponent);
		System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult);
		int negativeNumber = -13;
		int absoluteValue = java.lang.Math.abs(negativeNumber);
		System.out.println("Absolute value of " + negativeNumber + " is: " + absoluteValue);

	}
}
