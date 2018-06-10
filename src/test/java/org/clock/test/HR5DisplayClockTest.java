package org.clock.test;
import org.clock.Clock;
import org.clock.HR1DisplayClock;
import org.clock.HR5DisplayClock;
import org.clock.Min1DisplayClock;
import org.clock.Min5DisplayClock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HR5DisplayClockTest {
    private HR5DisplayClock hr5DisplayCl = null;
    private Clock clock; 
	@Before
	public void setUp() throws Exception {
    	hr5DisplayCl = new HR5DisplayClock();
    	HR1DisplayClock hr1 = new HR1DisplayClock();
    	Min5DisplayClock min5 = new Min5DisplayClock();
    	min5.setNextRow(new Min1DisplayClock());
    	hr1.setNextRow(min5);
    	hr5DisplayCl.setNextRow(hr1);
    	clock = new Clock("20:22:00");
	}

	@After
	public void tearDown() throws Exception {
		hr5DisplayCl =null;
		clock =null;
	}

	@Test
	public void testWhen() {
		hr5DisplayCl.display(clock);
		
	}
	
	@Test
	public void testWhenHr5IsZero() {
		clock =  new Clock("00:00:01");
		hr5DisplayCl.display(clock);
	}
	
	@Test(expected = NullPointerException.class)
	public void testWhenTimeNull() {
		hr5DisplayCl.display(null);
	}

}
