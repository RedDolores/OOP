package hw4;

import hw4.controler.TeacherControler;

public class Main {
    public static void main(String[] args) {
        TeacherControler controler = new TeacherControler();
        controler.create("1", "1", "1");
        controler.create("2", "2", "2");
        controler.create("4", "4", "4");
        controler.create("3", "3", "3");
        controler.sendOnConsoleTeachers();
    }
}
