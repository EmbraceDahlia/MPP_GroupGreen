package src.lab4.Exercise3;

public abstract class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public void print() {
        System.out.println("Employee id : " + empId);
    }

    public Paycheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);

        return new Paycheck(grossPay);
    }

    protected abstract double calcGrossPay(int month, int year);
}
