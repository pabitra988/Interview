package org.clock.test;

import static org.junit.Assert.*;

import org.clock.BerlinClock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BerlinClockTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testBlank(){
		BerlinClock.displayBerlinClock("::");
	}
	
	
	
	@Test
	public void testMidNight() {
		BerlinClock.displayBerlinClock("00:00:00");
	}
	
	@Test
	public void testAfterNoon() {
		BerlinClock.displayBerlinClock("13:17:01");
	}
	@Test
	public void testBFRMidnight() {
		BerlinClock.displayBerlinClock("23:59:59");
	}
	@Test
	public void testMidnight() {
		BerlinClock.displayBerlinClock("24:00:00");
	}
	
	
	
}

