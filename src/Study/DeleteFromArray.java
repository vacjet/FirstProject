package Study;

import java.util.ArrayList;
import java.util.List;

public class DeleteFromArray {
    public List<String> students;

    public DeleteFromArray() {
        students = new ArrayList<>();
        students.add("Sergey");
        students.add("Vitali");
        students.add("Maxim");
        students.add("Nataliya");
        students.add("Irina");
        students.add("Nokolay");
        students.add("Snezhana");
    }

    public void exclude(String excludedStudent) {
        students.removeIf(student -> student.equals(excludedStudent));
    }

    public static void main(String[] args) {
        DeleteFromArray deleteFromArray = new DeleteFromArray();
        deleteFromArray.exclude("Vitali");
        deleteFromArray.students.forEach(System.out::println);
    }
}
