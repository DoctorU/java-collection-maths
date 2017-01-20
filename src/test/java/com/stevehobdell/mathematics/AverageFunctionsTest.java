package com.stevehobdell.mathematics;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class AverageFunctionsTest {

	private Collection<Number> setOne;
	private Collection<Number> setThree;
	private Collection<Number> setTwo;

	@Before
	public void setUp() {
		setOne = new LinkedList<>();
		setTwo = new LinkedList<>();
		setThree = new LinkedList<>();

		Collections.addAll(setOne, 10.0D);
		Collections.addAll(setTwo, 9.0D, 1.0D);
		Collections.addAll(setThree, 8.0D, 4.0D, 6.0D);

	}

	@Test
	public final void testMean() {
		assertThat(AverageFunctions.mean(setOne)).isEqualTo(10.0D);
		assertThat(AverageFunctions.mean(setTwo)).isEqualTo(5.0D);
		assertThat(AverageFunctions.mean(setThree)).isEqualTo(6.0D);
	}

	@Test
	public final void testMedian() {
		assertThat(AverageFunctions.median(setOne)).isEqualTo(10.0D);
		assertThat(AverageFunctions.median(setTwo)).isEqualTo(5.0D);
		assertThat(AverageFunctions.median(setThree)).isEqualTo(8.0D);
	}

}
