package hw5.model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private int studentGroupId;
    private Teacher teacher;
    private List<Student> students;

    public StudentGroup(int studentGroupId, Teacher teacher, List<Student> students) {
        this.studentGroupId = studentGroupId;
        this.teacher = teacher;
        this.students = students;
    }

    public int getStudentGroupId() {
        return studentGroupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                "}\n";
    }
}
