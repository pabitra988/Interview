package org.clock;

import org.util.DisplayTimeColorUtil;

public class Min5DisplayClock implements DisplayClock {
	DisplayClock nextRow;

	

	@Override
	public void setNextRow(DisplayClock nextRow) {
		this.nextRow = nextRow;

	}

	@Override
	public void display(Clock time) {
		DisplayTimeColorUtil.validateTime(time);
		System.out.println();
		int MIN = Integer.valueOf(time.getMin());
		if (MIN >= MIN_5) {
			int count = MIN / MIN_5;
			Integer remain = MIN % MIN_5;

			DisplayTimeColorUtil.displayMIN5(count, time);

			this.nextRow.display(new Clock(time.getHr() + ":" + remain.toString() + ":" + time.getSec()));

		} else if (MIN == 0) {
			DisplayTimeColorUtil.displayMIN5(0, time);
			this.nextRow.display(new Clock(time.getHr() + ":" + time.getMin() + ":" + time.getSec()));
		} else {
			DisplayTimeColorUtil.displayMIN5(0, time);
			this.nextRow.display(time);
		}
	}

}
