public class objectCounter {
    
    private static int count = 0;

    
    public objectCounter() {
        count++;
    }

    
    public static int getObjectCount() {
        return count;
    }

    public static void main(String[] args) {
        
        objectCounter obj1 = new objectCounter();
        objectCounter obj2 = new objectCounter();
        objectCounter obj3 = new objectCounter();

        
        System.out.println("Total objects created: " + objectCounter.getObjectCount());
    }
}