// File: ParameterizedDemo.java
public class Parameterize {
    String name;
    int age;

    // Parameterized constructor
    public Parameterize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("name = " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        Parameterize p = new Parameterize("Michael", 21);
        p.display();
    }
}