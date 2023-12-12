package hw4.service;

import hw4.model.Student;
import hw4.model.StudentGroup;
import hw4.model.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
