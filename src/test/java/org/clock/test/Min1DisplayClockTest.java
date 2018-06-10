package org.clock.test;

import static org.junit.Assert.*;

import org.clock.Clock;
import org.clock.Min1DisplayClock;
import org.clock.Min5DisplayClock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Min1DisplayClockTest {

	private Min1DisplayClock min1Displ;
	private Clock clock ;
	@Before
	public void setUp() throws Exception {
		min1Displ = new Min1DisplayClock();
		
		clock =  new Clock("13:01:01");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWhenMin1IsZero() {
		clock =  new Clock("13:00:01");
		min1Displ.display(clock);
	}
	@Test
	public void testWhenMin1() {
		clock =  new Clock("13:01:01");
		min1Displ.display(clock);
	}
	@Test(expected = NullPointerException.class)
	public void testWhenTimeNull() {
		min1Displ.display(null);
	}

}
