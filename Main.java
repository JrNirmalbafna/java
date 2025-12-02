// 1. PARENT CLASS
class Beverage {
    String temperature;

    public Beverage(String temperature) {
        this.temperature = temperature;
        System.out.println("1. [Parent] Beverage initialized as: " + temperature);
    }
}

// 2. CHILD CLASS
class Coffee extends Beverage {
    String type;
    String size;

    // --- CONSTRUCTOR 1: The "Lazy" option ---
    // User just says "Give me a coffee"
    public Coffee() {
        // We assume they want a Medium Regular. 
        // We chain to Constructor 2.
        this("Regular", "Medium"); 
        System.out.println("4. [Child] Default Coffee created.");
    }

    // --- CONSTRUCTOR 2: The "Specific" option ---
    // User specifies what they want
    public Coffee(String type, String size) {
        // We chain to the Parent constructor (super) to set the temp.
        // We assume all coffee is "Hot".
        super("Hot"); 
        
        this.type = type;
        this.size = size;
        System.out.println("2. [Child] Coffee details set: " + size + " " + type);
        System.out.println("3. [Child] Serving the coffee...");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Customer 1: Orders Default Coffee ---");
        // This triggers the full chain: 
        // Coffee() -> Coffee(String, String) -> Beverage(String)
        Coffee myOrder = new Coffee(); 
    }
}