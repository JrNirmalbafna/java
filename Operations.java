import java.util.Scanner;

public class Operations {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Two Nunmbers for sum: ");
	int a = sc.nextInt();
	int b =  sc.nextInt();
	System.out.println("SUm =  " + (a + b));
	System.out.println("Enter Two Nunmbers for Subtraction: ");
	a = sc.nextInt(); 
	b = sc.nextInt();
	System.out.println("Difference = " + (a - b));
	System.out.println("Enter Two Nunmbers for Multiplication: ");
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("Multiplication: " + (a * b));
	System.out.println("Enter Two Nunmbers for Division: ");
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("Division: " + (a / b));
	System.out.println("Enter Two Nunmbers for Modulus: ");
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("Modulus: " + (a % b));
	System.out.println("Enter a three digit number: ");
	int num = sc.nextInt();
	int sum = (num / 100) + num % 10 + ((num / 10) % 10);
	System.out.println("Sum of digits: " + sum);
}
}
