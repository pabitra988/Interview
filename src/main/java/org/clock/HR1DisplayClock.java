package org.clock;

import org.util.DisplayTimeColorUtil;

public class HR1DisplayClock implements DisplayClock{
    DisplayClock nextRow; 
	
	

	@Override
	public void setNextRow(DisplayClock nextChain) {
		
		this.nextRow = nextChain;
	}

	@Override
	public void display(Clock time) {
		DisplayTimeColorUtil.validateTime(time);
        System.out.println();
		int HR = Integer.valueOf(time.getHr());
		if(HR >=HR_1) {
			int count = HR/HR_1;
			Integer remain = HR%HR_1;
			
			DisplayTimeColorUtil.displayHR(count, time);
			
				this.nextRow.display(new Clock(remain.toString()+":"+time.getMin()+":"+time.getSec()));
			
		} else if(HR == 0){
			DisplayTimeColorUtil.displayHR(0, time);
			this.nextRow.display(new Clock(time.getHr()+":"+time.getMin()+":"+time.getSec()));
		}else {
			DisplayTimeColorUtil.displayHR(0, time);
			this.nextRow.display(time);
		}
	}

}
