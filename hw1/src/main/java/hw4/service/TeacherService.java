package hw4.service;

import hw4.model.Teacher;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService() { this.teachers = new ArrayList<>(); }

    public List<Teacher> getTeachers() { return teachers; }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Teacher teacher : teachers) {
            if (maxId < teacher.getTeacherId()) maxId = teacher.getTeacherId();
        }
        maxId++;
        teachers.add(new Teacher(maxId, firstName, secondName, lastName));
    }
}
