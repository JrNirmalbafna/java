public class WrapperDemo {
    public static void main(String[] args) {
        
        int pInt = 10;
        double pDouble = 3.14;
        char pChar = 'A';
        boolean pBool = true;

        
        Integer objInt = Integer.valueOf(pInt);
        Double objDouble = Double.valueOf(pDouble);
        Character objChar = Character.valueOf(pChar);
        Boolean objBool = Boolean.valueOf(pBool);

        // 2) Using constructors (available in older Java versions; not recommended)
        Integer objInt2 = new Integer(pInt);
        // Double objDouble2 = new Double(pDouble); // similar

        // 3) Autoboxing (compiler converts primitive -> wrapper automatically)
        Integer autoInt = pInt;         // autoboxing
        Double autoDouble = pDouble;   // autoboxing

        // Using the wrapper objects
        System.out.println("objInt = " + objInt + ", objDouble = " + objDouble);
        System.out.println("objChar = " + objChar + ", objBool = " + objBool);

        // Unboxing: get primitive back
        int backToPrimitive = objInt.intValue();  // explicit unboxing
        int autoUnboxed = objInt;                 // automatic unboxing

        System.out.println("backToPrimitive = " + backToPrimitive);
        System.out.println("autoUnboxed = " + autoUnboxed);
    }
}