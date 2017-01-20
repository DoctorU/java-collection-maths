package com.stevehobdell.mathematics;

import static org.fest.assertions.api.Assertions.assertThat;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class BoundaryFunctionsTest {

	private Collection<Number> setOne;
	private Collection<Number> setTwo;

	@Before
	public void setUp() throws Exception {
		setOne = new LinkedList<>();
		setTwo = new LinkedList<>();
		Collections.addAll(setOne, -10L, +20L, -5.5D, -100F);
		Collections.addAll(setTwo, -40000L, +20L, -5.5D, +100F);
	}

	@Test
	public void testMax() {
		assertThat(BoundaryFunctions.max(setOne)).isEqualTo(20.0D);
		assertThat(BoundaryFunctions.max(setTwo)).isEqualTo(100.0D);

	}

	@Test
	public void testMin() {
		assertThat(BoundaryFunctions.min(setOne)).isEqualTo(-100.0D);
		assertThat(BoundaryFunctions.min(setTwo)).isEqualTo(-40000.0D);

	}
}
