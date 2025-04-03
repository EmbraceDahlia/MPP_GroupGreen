package lab4.Exercise3;

import java.time.LocalDate;
import java.util.*;

public class Commissioned extends Employee {
    private double baseSalary;
    private double commission;
    private List<Order> orders;

    public Commissioned(String empId, double baseSalary, double commission) {
        super(empId);
        this.baseSalary = baseSalary;
        this.commission = commission;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        int prevMonth = month - 1;
        int prevYear = year;
        if (prevMonth == 0) {
            prevMonth = 12;
            prevYear -= 1;
        }

        double orderTotal = 0.0;

        for (Order order : orders) {
            LocalDate date = order.getOrderDate();
            if (date.getMonthValue() == prevMonth && date.getYear() == prevYear) {
                orderTotal += order.getOrderAmount();
            }
        }

        return baseSalary + (commission * orderTotal);
    }

}
