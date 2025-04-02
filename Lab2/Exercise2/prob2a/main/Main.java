package Lab2.Exercise2.prob2a.main;

import Lab2.Exercise2.prob2a.Student;
import Lab2.Exercise2.prob2a.StudentGradeReportFactory;

public class Main {
    public static void main(String[] args) {
        Student s = StudentGradeReportFactory.createStudent("Dahlia");
        System.out.println(s);
    }
}
