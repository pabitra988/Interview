package org.clock.test;
import org.clock.Clock;
import org.clock.Min1DisplayClock;
import org.clock.Min5DisplayClock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Min5DisplayClockTest {

	private Min5DisplayClock min5Displ;
	private Clock clock ;
	
	@Before
	public void setUp() throws Exception {
		//min5Displ.display("13:17:01");
		min5Displ = new Min5DisplayClock();
		min5Displ.setNextRow(new Min1DisplayClock());
		clock =  new Clock("13:05:01");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWhenMin5IsZero() {
		clock =  new Clock("13:00:01");
		min5Displ.display(clock);
	}
	@Test
	public void testWhenMin() {
		clock =  new Clock("13:22:01");
		min5Displ.display(clock);
	}
	@Test(expected = NullPointerException.class)
	public void testWhenTimeNull() {
		min5Displ.display(null);
	}

}
