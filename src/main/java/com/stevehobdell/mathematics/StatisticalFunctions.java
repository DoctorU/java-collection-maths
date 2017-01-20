package com.stevehobdell.mathematics;

import static com.stevehobdell.mathematics.CoreFunctions.doubleStream;

import java.util.Collection;
import java.util.function.BinaryOperator;

public class StatisticalFunctions {
	public static Double standardDeviation(Collection<Number> data) {
		return Math.sqrt(variance(data));
	}

	public static Double variance(Collection<Number> data) {

		Double mean = AverageFunctions.mean(data);
		int size = data.size() - 1;
		return doubleStream(data).reduce(0.0D, varianceAccumulator(mean, size));

	}

	private static BinaryOperator<Double> varianceAccumulator(Double mean, int size) {
		return (a, b) -> a + (Math.pow(b - mean, 2) / size);
	}
}
