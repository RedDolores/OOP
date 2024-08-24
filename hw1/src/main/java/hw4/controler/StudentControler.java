package hw4.controler;

import hw4.model.Student;
import hw4.service.StudentService;
import hw4.view.StudentView;

public class StudentControler implements UserControler<Student>{
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
    }
    public void sendOnConsoleStudents(){
        studentView.sendOnConsole(studentService.getStudents());
    }
}
