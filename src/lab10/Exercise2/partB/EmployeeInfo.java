package lab10.Exercise2.partB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY}

    ;

    public void sort(List<Employee> emps, final SortMethod method) {
        class EmployeeComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (method == SortMethod.BYNAME) {
                    int result = e1.name.compareTo(e2.name);
                    if (result != 0) return result;
                    return Integer.compare(e1.salary, e2.salary);
                } else {
                    int result;
                    if (e1.salary == e2.salary) result = 0;
                    else if (e1.salary < e2.salary) result = -1;
                    else result = 1;
                    if (result != 0) return result;
                    return e1.name.compareTo(e2.name);
                }
            }
        }
        Collections.sort(emps, new EmployeeComparator());
    }

    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Andy", 60000));
        emps.add(new Employee("Andy", 110000));
        EmployeeInfo ei = new EmployeeInfo();
        ei.sort(emps, SortMethod.BYNAME);
        System.out.println(emps);
        //same instance
        ei.sort(emps, SortMethod.BYSALARY);
        System.out.println(emps);
    }
}
