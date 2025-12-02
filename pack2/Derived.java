package pack2;

import pack1.Base;

public class Derived extends Base {
    public static void main(String[] args) {
        Derived d = new Derived();

        System.out.println("Subclass in different package access:");
        System.out.println("publicField: " + d.publicField);
        // privateField not accessible
        System.out.println("protectedField: " + d.protectedField); // accessible because subclass
        // defaultField not accessible (package-private)
        
        d.publicMethod();
        // d.privateMethod(); // not allowed
        d.protectedMethod(); // accessible because subclass
        // d.defaultMethod(); // not allowed
    }
}