public class MultilevelInheritance {
    public static void main(String[] args) {
        Person p = new Person("Anita", 30);
        Employee e = new Employee("Rohan", 28, 1001, 45000);
        Manager m = new Manager("Deepak", 40, 2001, 90000, 20000);

        System.out.println(p);
        System.out.println(e);
        System.out.println(m);
        System.out.println("Manager total compensation: " + m.totalCompensation());

        // Polymorphism example: Employee reference to a Manager object
        Employee poly = new Manager("Sita", 35, 3001, 80000, 10000);
        System.out.println("Polymorphic reference: " + poly);
    }
}

// Base class Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Person{name=" + name + ", age=" + age + "}";
    }
}

// Employee extends Person
class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }
    public int getEmpId() { return empId; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee{empId=" + empId + ", name=" + getName() + ", age=" + getAge()
               + ", salary=" + salary + "}";
    }
}

// Manager extends Employee (multilevel inheritance)
class Manager extends Employee {
    private double bonus;

    public Manager(String name, int age, int empId, double salary, double bonus) {
        super(name, age, empId, salary);
        this.bonus = bonus;
    }
    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public double totalCompensation() {
        return getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{empId=" + getEmpId() + ", name=" + getName() + ", age=" + getAge()
               + ", salary=" + getSalary() + ", bonus=" + bonus + ", total=" + totalCompensation() + "}";
    }
}