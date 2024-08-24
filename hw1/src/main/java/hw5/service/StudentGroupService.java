package hw5.service;

import hw5.model.Student;
import hw5.model.StudentGroup;
import hw5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private List<StudentGroup> studentGroups;

    public StudentGroupService() {
        this.studentGroups = new ArrayList<>();
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }
    public List<Integer> getTeachersId(){
        List<Integer> ids = new ArrayList<>();
        for (StudentGroup studentGroup : studentGroups){
            ids.add(studentGroup.getTeacher().getTeacherId());
        }
        return ids;
    }
    public List<Teacher> getTeachers(){
        List<Teacher> teachers = new ArrayList<>();
        for (StudentGroup studentGroup : studentGroups){
            teachers.add(studentGroup.getTeacher());
        }
        return teachers;
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        int id = getMaxId();
        studentGroups.add(new StudentGroup(id, teacher, students));
    }

    private int getMaxId(){
        int lastId = 1;
        for (StudentGroup studentGroup : studentGroups){
            if (studentGroup.getTeacher() != null && studentGroup.getStudents() != null){
                lastId = studentGroup.getStudentGroupId() + 1;
            }
        }
        return lastId;
    }

}
