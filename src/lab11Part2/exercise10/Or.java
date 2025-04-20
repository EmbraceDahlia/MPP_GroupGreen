package lab11Part2.exercise10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(true), new Simple(false));
		System.out.println(someSimpleWithReduce(list));
		System.out.println(stringStream());
		myIntStream();
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		boolean accum = false;
		for(Simple s: list) {
			accum = accum || s.flag;
		}
		return accum;
	}

	///  Part A
	public static boolean someSimpleWithReduce(List<Simple> list) {
		return list.stream().map(i -> i.flag).reduce(false, ( prev, curr) -> prev || curr);
	}

	/// Part B
	public static String stringStream() {
		return Stream.of("Bill", "Mary", "Thomas").reduce("", (a,b) -> a + ", "  + b).substring(2);
	}

	/// Part C
	public static void myIntStream() {
		Stream<Integer> myIntStream = Stream.of(3, 5, 1, 9, 2); // example stream

		AbstractMap.SimpleEntry<Integer, Integer> result = myIntStream.collect(
				Collectors.teeing(
						Collectors.minBy(Integer::compareTo),
						Collectors.maxBy(Integer::compareTo),
						(min, max) -> new AbstractMap.SimpleEntry<>(min.get(), max.get())
				)
		);

		System.out.println("Min: " + result.getKey() + ", Max: " + result.getValue());
	}
}
