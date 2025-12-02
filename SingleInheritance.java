
public class SingleInheritance {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Asha", 50000);
        Manager m = new Manager(201, "Ravi", 80000, 15000);

        System.out.println(e);
        System.out.println(m);
        System.out.println("Manager total compensation: " + m.totalCompensation());

        
    }
}

// Base class Employee
class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

// Subclass Manager extends Employee
class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary); // constructor chaining to Employee
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public double totalCompensation() {
        return getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{id=" + getId() + ", name='" + getName() + "', salary=" + getSalary()
               + ", bonus=" + bonus + ", total=" + totalCompensation() + "}";
    }
}