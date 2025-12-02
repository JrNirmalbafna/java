package pack1;

public class Base {
    public String publicField = "publicField";
    private String privateField = "privateField";
    protected String protectedField = "protectedField";
    String defaultField = "defaultField"; // package-private

    public void publicMethod() {
        System.out.println("publicMethod");
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    // Helper to show private access inside the same class
    public void showPrivate() {
        System.out.println("Accessing privateField inside Base: " + privateField);
        privateMethod();
    }
}