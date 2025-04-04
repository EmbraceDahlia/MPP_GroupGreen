package src.lab4.Exercise3;

import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Commissioned commissionedemployee = new Commissioned("123", 100, 10);
        commissionedemployee.addOrder(new Order("O1", LocalDate.of(2025, 4, 2), 5000));
        commissionedemployee.addOrder(new Order("O2", LocalDate.of(2025, 4, 10), 3000));
        commissionedemployee.addOrder(new Order("O3", LocalDate.of(2025, 3, 15), 1000)); // previous month, won't count

        Employee hourlyEmplyee = new Hourly("123", 15, 9);
        Employee salariedEmployee = new Salaried("123", 500);

        Paycheck commissionedemployeePaycheck = commissionedemployee.calcCompensation(4, 2025);
        Paycheck hourlyEmplyeePaycheck = hourlyEmplyee.calcCompensation(4, 2025);
        Paycheck salariedEmployeePaycheck = salariedEmployee.calcCompensation(4, 2025);

        commissionedemployeePaycheck.print();
        hourlyEmplyeePaycheck.print();
        salariedEmployeePaycheck.print();
    }
}