import java.util.Scanner;
public class SringToIntegerConvert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number as a string: ");
		String input = sc.nextLine();
		try {
			int number = Integer.parseInt(input);
			System.out.println("Converted integer: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid integer string.");
		}
	}
}
