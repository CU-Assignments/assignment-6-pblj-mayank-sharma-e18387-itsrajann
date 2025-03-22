import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - Marks: " + marks;
    }
}

public class StudentFilterSort {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Vikash", 96),
            new Student("Aditya", 89),
            new Student("Vatsalya", 90),
            new Student("Rahul", 78),
            new Student("Aman", 65)
        );

        List<Student> filteredSortedStudents = students.stream()
            .filter(s -> s.marks > 75)
            .sorted((s1, s2) -> Double.compare(s2.marks, s1.marks))
            .collect(Collectors.toList());

        System.out.println("Filtered and Sorted Students:");
        filteredSortedStudents.forEach(s -> System.out.println(s.name));
    }
}
