package com.stevehobdell.mathematics;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.Collections;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class StatisticalFunctionsTest {

	private LinkedList<Number> setOne;
	private LinkedList<Number> setThree;
	private LinkedList<Number> setTwo;

	@Before
	public void setUp() throws Exception {
		setOne = new LinkedList<>();
		setTwo = new LinkedList<>();
		setThree = new LinkedList<>();
		Collections.addAll(setOne, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D);
		Collections.addAll(setTwo, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.1D);
		Collections.addAll(setThree, 5.0D, 10.0D, 15.0D, 20.0D, 25.0D);
	}

	@Test
	public final void testStandardDeviation() throws Exception {
		assertThat(StatisticalFunctions.standardDeviation(setOne)).isEqualTo(0.0D);
		assertThat(StatisticalFunctions.standardDeviation(setTwo)).isEqualTo(0.037796447300922756D);
		assertThat(StatisticalFunctions.standardDeviation(setThree)).isEqualTo(7.905694150420948D);
	}

	@Test
	public final void testVariance() throws Exception {
		assertThat(StatisticalFunctions.variance(setOne)).isEqualTo(0.0D);
		assertThat(StatisticalFunctions.variance(setTwo)).isEqualTo(0.0014285714285714312D);
		assertThat(StatisticalFunctions.variance(setThree)).isEqualTo(62.5D);
	}

}
