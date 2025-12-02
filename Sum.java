public class Sum {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Please provide at least two numbers as command-line arguments.");
			return;
		}
		int sum = 0;
		for(String arg : args) {
			try {
				int number = Integer.parseInt(arg);
				sum += number;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number format: " + arg);
				return;
			}
		}

		System.out.println("The sum of " + String.join(", ", args) + " is: " + sum);
	}
}
