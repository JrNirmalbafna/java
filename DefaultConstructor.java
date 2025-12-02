public class DefaultConstructor {
	String name;
	int age;	

	DefaultConstructor() {
		name = "Nirmal";
		age = 20;
	}
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}		
	public static void main(String args[]) {
		DefaultConstructor obj = new DefaultConstructor();
		obj.display();
	}
}
