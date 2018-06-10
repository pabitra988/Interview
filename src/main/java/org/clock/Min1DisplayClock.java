package org.clock;

import org.util.DisplayTimeColorUtil;

public class Min1DisplayClock implements DisplayClock{
    DisplayClock nextRow;
	

	@Override
	public void setNextRow(DisplayClock nextRow) {
		this.nextRow = nextRow;
		
	}

	@Override
	public void display(Clock clock) {
		DisplayTimeColorUtil.validateTime(clock);
		
		int MIN = Integer.valueOf(clock.getMin());
		if (MIN >= MIN_1) {
			int count = MIN / MIN_1;
			
			DisplayTimeColorUtil.displayMIN1(count, clock);
			System.out.println();
			
		} else  {
			DisplayTimeColorUtil.displayMIN1(0, clock);
		}
		
	}

}
