package pack2;

import pack1.Base;

public class OtherPackageTest {
    public static void main(String[] args) {
        Base b = new Base();

        System.out.println("Non-subclass in different package access:");
        System.out.println("publicField: " + b.publicField);
        // protectedField not accessible here because not a subclass
        // defaultField not accessible
        // privateField not accessible

        b.publicMethod();
        // b.protectedMethod(); // not allowed
        // b.defaultMethod(); // not allowed
        // b.privateMethod(); // not allowed
    }
}