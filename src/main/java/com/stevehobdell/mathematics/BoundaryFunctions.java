package com.stevehobdell.mathematics;

import static com.stevehobdell.mathematics.CoreFunctions.doubleStream;

import java.util.Collection;

public class BoundaryFunctions {

	public static Double max(Collection<Number> data) {
		return doubleStream(data).reduce(Math::max).orElse(Double.MAX_VALUE);
	}

	public static Double min(Collection<Number> data) {
		return doubleStream(data).reduce(Math::min).orElse(Double.MIN_VALUE);
	}

}
