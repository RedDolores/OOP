package hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students = new ArrayList<>();
    private int index;

    public StudentGroup(List<Student> students) {
        this.students = students;
        this.index = 0;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student next() {
                return students.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }
}
