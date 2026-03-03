package ExThree.Utils;

import ExOne.Models.Student;

import java.util.Comparator;
import java.util.List;

public class Filter {
    public void filterGPA(List<Student> students)
    {
        students.stream()
                .filter(s -> s.getGPA() >= 3.2)
                .sorted(Comparator.comparing(Student::getGPA).reversed())
                .forEach(System.out::println);
    }
}
