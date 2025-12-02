// SuperDemo.java
public class SuperDemo {
    public static void main(String[] args) {
        Child c = new Child("Alice", "Max", 42);
        c.showNames();
        c.callParentMethod();
    }
}

class Parent {
    protected String name; // parent variable

    public Parent(String name) { // parent constructor
        this.name = name;
    }

    public void greet() { // parent method
        System.out.println("Hello from Parent: " + name);
    }
}

class Child extends Parent {
    // child has a field with the same name (hides parent's field)
    private String name;
    private int id;

    // call parent constructor using super(...)
    public Child(String parentName, String childName, int id) {
        super(parentName); // initializes Parent.name
        this.name = childName; // initializes Child.name
        this.id = id;
    }

    // access parent variable using super.name
    public void showNames() {
        System.out.println("Child.name: " + this.name);
        System.out.println("Parent.name via super.name: " + super.name);
    }

    // override greet and show how to call parent's version
    @Override
    public void greet() {
        System.out.println("Hello from Child: " + name + " (id=" + id + ")");
    }

    // call parent method explicitly using super.methodName()
    public void callParentMethod() {
        System.out.println("Calling overridden parent method from child:");
        super.greet(); // invokes Parent.greet()
        System.out.println("Now calling child's greet():");
        this.greet();  // invokes Child.greet()
    }
}