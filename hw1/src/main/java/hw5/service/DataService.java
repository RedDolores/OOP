package hw5.service;


import hw5.model.Student;
import hw5.model.Teacher;
import hw5.model.Type;
import hw5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getMaxId(type);
        if (type == Type.STUDENT) {
            users.add(new Student(id, firstName, secondName, lastName));
        }
        if (type == Type.TEACHER) {
            users.add(new Teacher(id, firstName, secondName, lastName));
        }

    }

    private int getMaxId(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user : users) {
            if (user instanceof Teacher && !itsStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }

    public List<Student> getAllStudents() {
        List<Student> result = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student) result.add((Student) user);
        }
        return result;
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> result = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher) result.add((Teacher) user);
        }
        return result;
    }
}
