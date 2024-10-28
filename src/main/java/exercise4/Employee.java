package exercise4;

public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void printDetails() {
        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);
    }
}
