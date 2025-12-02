// HierarchicalInheritanceDemo.java
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Parent p = new Parent("ParentOne");
        ChildA a = new ChildA("ChildA", 10);
        ChildB b = new ChildB("ChildB", "blue");
        System.out.println(p);
        System.out.println(a);
        System.out.println(b);
    }
}

class Parent {
    private String name;
    public Parent(String name) { this.name = name; }
    public String getName() { return name; }
    @Override public String toString() { return "Parent{name=" + name + "}"; }
}

class ChildA extends Parent {
    private int grade;
    public ChildA(String name, int grade) { super(name); this.grade = grade; }
    @Override public String toString() { return "ChildA{name=" + getName() + ", grade=" + grade + "}"; }
}

class ChildB extends Parent {
    private String favoriteColor;
    public ChildB(String name, String favoriteColor) { super(name); this.favoriteColor = favoriteColor; }
    @Override public String toString() { return "ChildB{name=" + getName() + ", color=" + favoriteColor + "}"; }
}