public class Factrial {
	public static void main(String [] args)
	{
		if(args.length != 1) {
			System.out.println("Please provide a single integer argument.");
			return;
		}
		int number = Integer.parseInt(args[0]);
		if(number < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
			return;
		}
		long factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial *= i;
		}
		System.out.println("Factorial of " + number + " is: " + factorial);
	}
}
