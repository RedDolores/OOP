package hw4.model;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> students;
    private int counter;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        return students.get(counter++);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
