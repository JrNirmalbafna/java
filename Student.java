class Student
{
	int rollNo;
	String name;
	int marks;

	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.rollNo = 101;
		s1.name = "Alice";
		s1.marks = 95;
		System.out.println("Roll No: " + s1.rollNo);
		System.out.println("Name: " + s1.name);
		System.out.println("Marks: " + s1.marks);
	}
}