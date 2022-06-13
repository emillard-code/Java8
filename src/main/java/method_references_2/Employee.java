package method_references_2;

public class Employee {

    String name;
    int salary;

    public Employee() { }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void description() {
        if (name != null) {
            System.out.println("This Employee's name is " + name + ", and they make $" + salary + " a year.");
        } else {
            System.out.println("This is an Employee.");
        }
    }

}
