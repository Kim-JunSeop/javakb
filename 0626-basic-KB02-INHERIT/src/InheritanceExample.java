class Employee {
    private String name;
    private String address;
    private int salary;
    private int rrn;

    public Employee(String name, String address, int salary, int rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    @Override
    public String toString() {
        return "Employee [name: " + name + ", address: " + address +
                ", salary: " + salary + ", rrn: " + rrn + "]";
    }

}
class Manager extends Employee {
    private int bonus;

    public Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    public void test() {
        System.out.println("This is a test method in the Manager class.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Manager [bonus: " + bonus + "]";
    }
}

public class InheritanceExample{
    public static void main(String[] args) {
        Employee emp = new Employee("John", "123 Main St", 50000, 123456789);
        System.out.println(emp.toString());

        Manager mgr = new Manager("Jane", "456 High St", 70000, 987654321, 5000);
        System.out.println(mgr.toString());

        mgr.test();
    }
}