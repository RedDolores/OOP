package hw4.view;

import hw4.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student st : list) System.out.println(st + " ");
    }
}
