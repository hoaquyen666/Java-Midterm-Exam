import ExOne.Models.Student;
import ExOne.T.StudentManager;
import ExThree.Utils.Filter;
import ExTwo.Utils.Calculate;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("Câu1:");
        Student student1 = new Student("1", "Sinh Viên A", 1);
        Student student2 = new Student("2", "Sinh Viên B", 2);
        Student student3 = new Student("3", "Sinh Viên C", 4);
        Student student4 = new Student("4", "Sinh Viên D", 3.2);

        StudentManager<Student> studentManager = new StudentManager<Student>();
        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);
        studentManager.add(student4);

        studentManager.getAll();
        System.out.println("======");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        System.out.println("Câu3:");
        Filter filter = new Filter();
        filter.filterGPA(students);

    }
}
