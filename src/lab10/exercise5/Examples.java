package lab10.exercise5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {

    //type: Class::instanceMethod
    Function<String, String> upper1 = (String x) -> x.toUpperCase();
    Function<String, String> upper2 = String::toUpperCase;

    Function<Employee, String> getName = e -> e.getName();
    Function<Employee, String> getNameClassInstanceMethodReference = Employee::getName;

    BiConsumer<Employee, String> setName = (e, s) -> e.setName(s);
    BiConsumer<Employee, String> setNameClassInstanceMethodReference = Employee::setName;

    BiFunction<String, String, Integer> compareTo = (s1, s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> compareToClassInstanceMethodReference = String::compareTo;

    BiFunction<Integer, Integer, Double> mathPow = (x, y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> mathPowClassStaticMethodReference = Math::pow;

    Function<Apple, Double> getWeight = a -> a.getWeight();
    Function<Apple, Double> getWeightClassInstanceMethodReference = Apple::getWeight;

    Function<String, Integer> parseInt = s -> Integer.parseInt(s);
    Function<String, Integer> parseIntClassStaticMethodReference = Integer::parseInt;

    EmployeeNameComparator comp = new EmployeeNameComparator();
    Comparator<Employee> compare = (e1, e2) -> (comp.compare(e1, e2));
    Comparator<Employee> compareObjectInstanceMethodReference = comp::compare;

    public void evaluator() {
        System.out.println(upper2.apply("hello"));
        Employee e = new Employee("Cherry", 8000);
        System.out.println(getName.apply(e));
        System.out.println(getNameClassInstanceMethodReference.apply(e));
        setName.accept(e, "Berry");
        System.out.println(e.getName());
        setNameClassInstanceMethodReference.accept(e, "Jerry");
        System.out.println(e.getName());
        System.out.println(compareTo.apply("Hello", "Hi"));
        System.out.println(compareToClassInstanceMethodReference.apply("Hello", "Hi"));
        System.out.println(mathPow.apply(2, 7));
        System.out.println(mathPowClassStaticMethodReference.apply(2, 7));
        Apple a = new Apple(0.1);
        System.out.println(getWeight.apply(a));
        System.out.println(getWeightClassInstanceMethodReference.apply(a));
        System.out.println(parseInt.apply("9"));
        System.out.println(parseIntClassStaticMethodReference.apply("9"));
        Employee e1 = new Employee("John", 10000);
        Employee e2 = new Employee("Anna", 15000);
        System.out.println(compare.compare(e1, e2));
        System.out.println(compareObjectInstanceMethodReference.compare(e1, e2));
        List<Employee> employees1 = Arrays.asList(e1, e2);
        employees1.sort(compare);
        employees1.forEach(System.out::println);
        List<Employee> employees2 = Arrays.asList(e1, e2);
        employees2.sort(compareObjectInstanceMethodReference);
        employees2.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Examples e = new Examples();
        e.evaluator();
    }

}

class Employee {
    String name;
    int salary;

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary + ">");
        return sb.toString();

    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (!(ob instanceof Employee)) return false;
        Employee e = (Employee) ob;
        return e.name.equals(name) && e.salary == salary;

    }
}

class EmployeeNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.name.compareTo(e2.name) != 0)
            return e1.name.compareTo(e2.name);
        return Integer.compare(e1.salary, e2.salary);
    }
}

class Apple {
    private double weight;

    public Apple(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
