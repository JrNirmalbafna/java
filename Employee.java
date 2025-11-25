import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	private int salary;

	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		empid = sc.nextInt();
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Salary: ");
		salary = sc.nextInt();
	}

	public void display()
	{
		System.out.println("Employee ID: " + empid);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

	public static void main(String args[])
	{
		Employee e1 = new Employee();
		e1.acceptData();
		e1.display();
	}
}
