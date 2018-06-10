package org.util.test;

import static org.junit.Assert.fail;

import org.clock.Clock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.util.DisplayTimeColorUtil;

public class DisplayTimeColorUtilTest {
	DisplayTimeColorUtilTest displayClockutil;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void displayHRZero() {
		DisplayTimeColorUtil.displayHR(1, new Clock("00:00:00"));
		
	}
	@Test
	public void displayHR() {
		DisplayTimeColorUtil.displayHR(1, new Clock("4:00:00"));
		
	}
	@Test()
	public void displayHRNull() {
		DisplayTimeColorUtil.displayHR(1, null);
	}
	@Test
	public void displayMIN5Zero() {
		DisplayTimeColorUtil.displayMIN5(1, new Clock("01:00:00"));
	}
	@Test
	public void displayMIN5() {
		DisplayTimeColorUtil.displayMIN5(1, new Clock("01:17:00"));
	}
	@Test
	public void displayMIN1Zero() {
		DisplayTimeColorUtil.displayMIN1(1, new Clock("01:00:00"));
	}
	@Test
	public void displayMIN1() {
		DisplayTimeColorUtil.displayMIN1(1, new Clock("01:01:00"));
	}
	
	
	

}
