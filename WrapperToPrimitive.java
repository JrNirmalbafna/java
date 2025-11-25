public class WrapperToPrimitive {
    public static void main(String[] args) {
        // create wrapper objects
        Integer wInt = Integer.valueOf(123);
        Double wDouble = Double.valueOf(45.67);
        Character wChar = Character.valueOf('Z');
        Boolean wBool = Boolean.valueOf(true);

        // 1) Explicit unboxing using methods
        int pInt1 = wInt.intValue();
        double pDouble1 = wDouble.doubleValue();
        char pChar1 = wChar.charValue();
        boolean pBool1 = wBool.booleanValue();

        System.out.println("Explicit unboxing:");
        System.out.println("int = " + pInt1 + ", double = " + pDouble1 + ", char = " + pChar1 + ", boolean = " + pBool1);

        // 2) Autounboxing (compiler converts automatically)
        int pInt2 = wInt;
        double pDouble2 = wDouble;
        char pChar2 = wChar;
        boolean pBool2 = wBool;

        System.out.println("Autounboxing:");
        System.out.println("int = " + pInt2 + ", double = " + pDouble2 + ", char = " + pChar2 + ", boolean = " + pBool2);

        // 3) Example showing NPE risk with autounboxing from null
        Integer maybeNull = null;
        System.out.println("Demonstrating null-safety (will comment out the actual risky line):");
        // int crash = maybeNull; // <-- this would throw NullPointerException if uncommented
        System.out.println("If you autounbox a null wrapper, you get a NullPointerException");
    }
}