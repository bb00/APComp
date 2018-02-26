package Chap7.PP3;

import Chap7.PP2.Student;
import java.util.ArrayList;

public class Course {
    private ArrayList<Student> students;
    private String name;
    
    public Course(String name) {
        this.name = name;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public double average() {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).average();
        }
        return sum / students.size();
    }
}
