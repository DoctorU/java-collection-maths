package com.stevehobdell.mathematics;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AverageFunctions {

	public static Double mean(Collection<Number> numbers) {
		return sum(numbers) / numbers.size();
	}

	public static Double median(Collection<Number> numbers) {
		List<Number> numberList = sort(numbers);

		int midNumber = midNumber(numberList);
		if (numbers.size() > 0 && numbers.size() % 2 == 0) {
			return mean(numberList.subList(midNumber - 1, midNumber + 1));
		} else {
			return numberList.get(midNumber).doubleValue();
		}
	}

	public static Double[] modes(Collection<Number> numbers) {
		throw new IllegalArgumentException("Not yet implemented");

	}

	private static int midNumber(Collection<Number> numbers) {
		int size = numbers.size();
		if (size > 1 && size % 2 == 1) {
			size++;
		}
		return size / 2;
	}

	private static List<Number> sort(Collection<Number> numbers) {
		return numbers.stream().sorted().collect(Collectors.toList());
	}

	private static Double sum(Collection<Number> numbers) {
		return numbers.stream().map(Number::doubleValue).reduce(0.0D, (a, b) -> a + b);
	}

}
