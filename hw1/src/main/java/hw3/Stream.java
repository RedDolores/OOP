package hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroups = new ArrayList<>();
    private int index;
    private int countStudentGroup;

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
        this.index = 0;
        this.countStudentGroup = this.studentGroups.size();
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void addStudentGroup(StudentGroup studentGroup){
        this.studentGroups.add(studentGroup);
    }

    public int getCountStudentGroup(){
        return this.countStudentGroup;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            @Override
            public boolean hasNext() {
                return index > studentGroups.size();
            }

            @Override
            public StudentGroup next() {
                return studentGroups.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return "Stream{" +
                " countStudentGroup=" + countStudentGroup +
                ", studentGroups=" + studentGroups;
    }
}
