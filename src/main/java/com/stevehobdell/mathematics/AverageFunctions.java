package com.stevehobdell.mathematics;

import static com.stevehobdell.mathematics.CoreFunctions.doubleStream;

import java.util.Collection;
import java.util.List;

public class AverageFunctions {

	public static Double mean(Collection<Number> numbers) {
		return sum(numbers) / numbers.size();
	}

	public static Double median(Collection<Number> numbers) {
		List<Number> numberList = CoreFunctions.sort(numbers);

		int midNumber = midNumber(numberList);
		if (numbers.size() > 0 && numbers.size() % 2 == 0) {
			return mean(numberList.subList(midNumber - 1, midNumber + 1));
		} else {
			return numberList.get(midNumber).doubleValue();
		}
	}

	public static Double[] modes(Collection<Number> data) {
		throw new IllegalArgumentException("Not yet implemented");

	}

	private static int midNumber(Collection<Number> data) {
		int size = data.size();
		if (size > 1 && size % 2 == 1) {
			size++;
		}
		return size / 2;
	}

	private static Double sum(Collection<Number> data) {
		return doubleStream(data).reduce(0.0D, (a, b) -> a + b);
	}

}
