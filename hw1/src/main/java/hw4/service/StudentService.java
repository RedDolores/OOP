package hw4.service;

import hw4.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Student st : students) {
            if (maxId < st.getStudentId()) maxId = st.getStudentId();
        }
        maxId++;
        students.add(new Student(maxId, firstName, secondName, lastName));
    }
}
