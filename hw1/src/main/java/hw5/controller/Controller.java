package hw5.controller;


import hw5.model.*;
import hw5.service.DataService;
import hw5.service.StudentGroupService;
import hw5.view.StudentGroupView;
import hw5.view.StudentView;
import hw5.view.TeacherView;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudentGroupView studentGroupView = new StudentGroupView();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudents() {
        for (Student user : dataService.getAllStudents()) {
            studentView.printOnConsole(user);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllTeachers() {
        for (Teacher user : dataService.getAllTeachers()) {
            teacherView.printOnConsole(user);
        }
    }

    public void createStudentGroup() {
        List<Teacher> teachers = dataService.getAllTeachers();
        List<Student> students = dataService.getAllStudents();
        List<Teacher> teachersInGroup = studentGroupService.getTeachers();
        for (Teacher teacher : teachers){
            if (!teachersInGroup.contains(teacher)) {
                studentGroupService.createStudentGroup(teacher, students);
            }
        }
    }


    public void getAllStudentGroups() {
        for (StudentGroup studentGroup : studentGroupService.getStudentGroups()) {
            studentGroupView.printOnConsole(studentGroup);
        }
    }
}
