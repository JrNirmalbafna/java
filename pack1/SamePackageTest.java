package pack1;

public class SamePackageTest {
    public static void main(String[] args) {
        Base b = new Base();

        System.out.println("Same package access:");
        System.out.println("publicField: " + b.publicField);
        // privateField not accessible here
        System.out.println("protectedField: " + b.protectedField);
        System.out.println("defaultField: " + b.defaultField);

        b.publicMethod();
        // b.privateMethod(); // not allowed
        b.protectedMethod();
        b.defaultMethod();

        b.showPrivate(); // demonstrates private access from inside Base
    }
}