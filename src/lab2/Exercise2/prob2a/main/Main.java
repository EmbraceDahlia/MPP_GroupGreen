package lab2.Exercise2.prob2a.main;

import lab2.Exercise2.prob2a.Student;
import lab2.Exercise2.prob2a.StudentGradeReportFactory;

public class Main {
    public static void main(String[] args) {
        Student s = StudentGradeReportFactory.createStudent("Dahlia");
        System.out.println(s);
    }
}
