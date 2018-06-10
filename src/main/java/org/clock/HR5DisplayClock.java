package org.clock;

import org.util.DisplayTimeColorUtil;

public class HR5DisplayClock implements DisplayClock {
	DisplayClock nextRow;



	@Override
	public void setNextRow(DisplayClock nextRow) {
		this.nextRow = nextRow;

	}

	@Override
	public void display(Clock time) {
		DisplayTimeColorUtil.validateTime(time);
		if("00".equals(time.getSec())){
			System.out.println(ClockTimeColor.YELLOW.getColor());
		} else {
			System.out.println(ClockTimeColor.DEFAULT.getColor());
		}
		
		int HR = Integer.valueOf(time.getHr());
		if(HR >=HR_5) {
			int count = HR/HR_5;
			Integer remain = HR%HR_5;
			
            DisplayTimeColorUtil.displayHR(count, time);			
			
				
				this.nextRow.display(new Clock(remain.toString()+":"+time.getMin()+":"+time.getSec()));
			
		} else if(HR == 0){
			DisplayTimeColorUtil.displayHR(0, time);
			this.nextRow.display(new Clock(time.getHr()+":"+time.getMin()+":"+time.getSec()));
		} else {
			DisplayTimeColorUtil.displayHR(0, time);
			this.nextRow.display(time);
		}

	}

}
