package hw4.controler;

import hw4.model.Teacher;
import hw4.service.TeacherService;
import hw4.view.TeacherView;

public class TeacherControler implements UserControler<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }
    public void sendOnConsoleTeachers(){
        teacherView.sendOnConsole(teacherService.getTeachers());
    }
}
