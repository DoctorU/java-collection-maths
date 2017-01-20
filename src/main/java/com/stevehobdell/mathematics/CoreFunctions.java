package com.stevehobdell.mathematics;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Core data collection manipulation functions.
 *
 * No Unit Test for this class, because the functions here are implicitly used
 * in other mathematics classes, and so are covered sufficiently.
 */
class CoreFunctions {

	/**
	 * Convert a data collection of data into a stream of Doubles.
	 */
	static Stream<Double> doubleStream(Collection<Number> data) {
		return data.stream().map(Number::doubleValue);
	}

	/**
	 * Convert a data collection into a sorted List of Doubles.
	 */
	static List<Number> sort(Collection<Number> data) {
		return data.stream().sorted().collect(Collectors.toList());
	}

}
