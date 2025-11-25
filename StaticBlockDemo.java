public class StaticBlockDemo {

    // First static block
    static {
        System.out.println("Static block 1: executed before main()");
    }

    // Second static block
    static {
        System.out.println("Static block 2: executed before main()");
    }

    public static void main(String[] args) {
        System.out.println("Inside main(): executed after all static blocks");
    }
}