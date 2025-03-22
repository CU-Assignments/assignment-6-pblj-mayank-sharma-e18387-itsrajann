import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return name + " - Age: " + age + ", Salary: " + salary;
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Vikash", 21, 350000),
            new Employee("Aditya", 21, 120000),
            new Employee("Vatsalya", 21, 130000)
        );

        Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("Sorted by Name: " + employees);

        Collections.sort(employees, (e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("Sorted by Salary: " + employees);
    }
}
