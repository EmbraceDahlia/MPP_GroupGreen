package src.lab2.Exercise2.prob2a;

public class StudentGradeReportFactory {
    public static Student createStudent(String name) {
        if (name == null)
            throw new IllegalArgumentException("Student name cannot be null!");

        Student s = new Student("Dahlia");
        GradeReport gRpt = new GradeReport(s);
        s.setGradeReport(gRpt);

        return s;
    }
}
