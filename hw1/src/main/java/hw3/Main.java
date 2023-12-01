package hw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Ivan", "Ivanov");
        Student student2 = new Student(2, "Petr", "Petrov");
        Student student3 = new Student(3, "Semen", "Semenov");
        Student student4 = new Student(4, "Sergey", "Sergeev");
        Student student5 = new Student(5, "Egor", "Ivanov");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentGroup studentGroup1 = new StudentGroup(students);
        StudentGroup studentGroup2 = new StudentGroup(students);
        StudentGroup studentGroup3 = new StudentGroup(students);
        StudentGroup studentGroup4 = new StudentGroup(students);
        StudentGroup studentGroup5 = new StudentGroup(students);

        List<StudentGroup> studentGroups1 = new ArrayList<>();
        studentGroups1.add(studentGroup1);
        studentGroups1.add(studentGroup2);
        studentGroups1.add(studentGroup3);
        List<StudentGroup> studentGroups2 = new ArrayList<>();
        studentGroups2.add(studentGroup4);
        studentGroups2.add(studentGroup5);
        List<StudentGroup> studentGroups3 = new ArrayList<>();
        studentGroups3.add(studentGroup4);
        studentGroups3.add(studentGroup5);
        studentGroups3.add(studentGroup1);
        studentGroups3.add(studentGroup2);
        studentGroups3.add(studentGroup3);

        List<Stream> streams = new ArrayList<>();
        Stream stream1 = new Stream(studentGroups1);
        Stream stream2 = new Stream(studentGroups2);
        Stream stream3 = new Stream(studentGroups3);
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        StreamService streamService = new StreamService(streams);
        for (Stream stream : streamService.getSortedStreamByCount()){
            System.out.println(stream);
        }


//        StudentGroupService studentGroupService = new StudentGroupService(studentGroup1);
//
//        for (Student student : studentGroup1) {
//            System.out.println(student);
//        }
//        System.out.println();
//
//
//        for (Student student : studentGroupService.getSortedStudentGroup()) {
//            System.out.println(student);
//        }
//        System.out.println();
//
//        for (Student student : studentGroupService.getSortedStudentGroupByLastName()) {
//            System.out.println(student);
//        }

    }
}
