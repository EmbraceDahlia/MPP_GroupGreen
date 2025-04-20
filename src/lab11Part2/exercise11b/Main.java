package lab11Part2.exercise11b;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));

		System.out.println(FILTER_BY_SALARY_AND_LASTNAME_RANGE.apply(list, 100000, 'N'));

	}

	public static final TriFunction<List<Employee>, Integer, Character, String> FILTER_BY_SALARY_AND_LASTNAME_RANGE =
			(list, salaryThreshold, charFrom) -> list.stream()
					.filter(e -> e.getSalary() > salaryThreshold &&
							Character.toUpperCase(e.getLastName().charAt(0)) >= Character.toUpperCase(charFrom) &&
							Character.toUpperCase(e.getLastName().charAt(0)) <= 'Z')
					.map(e -> e.getFirstName() + " " + e.getLastName())
					.sorted()
					.collect(Collectors.joining(", "));

}
