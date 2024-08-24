package hw5;

import hw5.controller.Controller;
import hw5.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("s1", "s1", "s1");
        controller.createStudent("s2", "s2", "s2");
        controller.createStudent("s3", "s3", "s3");
        controller.createStudent("s4", "s4", "s4");
        controller.createTeacher("t1", "t1", "t1");
        controller.createStudentGroup();
        controller.getAllStudentGroups();

        controller.createTeacher("t3", "t3", "t3");
        controller.createStudent("s5", "s5", "s5");
        controller.createStudent("s6", "s6", "s6");
        controller.createStudentGroup();
        controller.getAllStudentGroups();

    }
}