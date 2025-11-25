class Shared {
    // static member shared across all instances
    static int count = 0;

    // instance field (separate per object)
    int id;

    Shared() {
        // increment shared static counter
        count++;
        id = count; // give each instance a unique id at construction time
    }

    void show() {
        System.out.println("Object id = " + id + ", Shared.count = " + count);
    }

    static void showStatic() {
        System.out.println("Shared.count (from class) = " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Shared a = new Shared();
        Shared b = new Shared();
        Shared c = new Shared();

        a.show();
        b.show();
        c.show();

        // modify static via one instance
        b.count = 42;

        System.out.println("--- after b.count = 42 ---");
        a.show();
        b.show();
        c.show();

        // access static via class
        Shared.showStatic();
    }
}