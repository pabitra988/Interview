package org.clock.test;

import org.clock.Clock;
import org.clock.HR1DisplayClock;
import org.clock.Min1DisplayClock;
import org.clock.Min5DisplayClock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HR1DisplayClockTest {
	private HR1DisplayClock hr1 ;
	private Clock clock;
	@Before
	public void setUp() throws Exception {
	    hr1 = new HR1DisplayClock();
    	Min5DisplayClock min5 = new Min5DisplayClock();
    	min5.setNextRow(new Min1DisplayClock());
    	hr1.setNextRow(min5);
    	//clock = new Clock("04:00:00");
	}

	@After
	public void tearDown() throws Exception {
		hr1 = null;
		clock = null;
	}

	@Test
	public void testDisplayHR1() {
		clock = new Clock("04:00:00");
		hr1.display(clock);
	}
	
	@Test
	public void testWhenHr1IsZero() {
		clock =  new Clock("00:00:01");
		hr1.display(clock);
	}
	
	@Test(expected = NullPointerException.class)
	public void testWhenTimeNull() {
		hr1.display(null);
	}

}
