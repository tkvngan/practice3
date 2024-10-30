package exercise4;

public class Employee extends Person{
    double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Name: Alice, Age: 30, Salary: 50000.00")
    }
}
