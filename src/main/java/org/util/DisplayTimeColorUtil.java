package org.util;

import static org.clock.DisplayClock.ROW_1_MIN;
import static org.clock.DisplayClock.ROW_5_MIN;
import static org.clock.DisplayClock.ROW_HR_SIZE;

import org.clock.ClockTimeColor;
import org.clock.Clock;

public class DisplayTimeColorUtil {

    public static void displayHR5(int count, Clock time) {
		displayHR(count, time);
	}

	public static void displayHR(int count, Clock time) {
        validateTime(time);
        //System.out.print("\n");
        for (int x = 1; x <= ROW_HR_SIZE; x++) {
            // System.out.print("R");
            try {
                if (0 == Integer.valueOf(time.getHr())) {
                    System.out.print(ClockTimeColor.DEFAULT.getColor());
                    continue;
                }
                if (x <= count && count != 0) {
                    System.out.print(ClockTimeColor.RED.getColor());
                } else {
                    System.out.print(ClockTimeColor.DEFAULT.getColor());
                }
            } catch (Exception e) {
                 throw new RuntimeException("Exception :: displayHR5 >> "+e.getMessage());
            }
        }
    }

    public static void displayMIN5(int count, Clock time) {
    	validateTime(time);	
    	//System.out.print("\n");
        for (int x = 1; x <= ROW_5_MIN; x++) {
            if (0 == Integer.valueOf(time.getMin())) {
                System.out.print(ClockTimeColor.DEFAULT.getColor());
                continue;
            }
            if (x <= count) {
                ClockTimeColor dispMin = x % 3 == 0 ? ClockTimeColor.RED : ClockTimeColor.YELLOW;
                System.out.print(dispMin.getColor());
            } else {
                System.out.print(ClockTimeColor.DEFAULT.getColor());
            }
        }
    }

    public static void displayMIN1(int count,Clock time) {
    	validateTime(time);
    	System.out.print("\n");
    	for (int x = 1; x <= ROW_1_MIN; x++) {
    		if (0 == Integer.valueOf(time.getMin())) {
                System.out.print(ClockTimeColor.DEFAULT.getColor());
                continue;
            }
			if (x<=count) {
				System.out.print(ClockTimeColor.YELLOW.getColor());
			} else {
				System.out.print(ClockTimeColor.DEFAULT.getColor());
			}
		}
    }
    
    public static void validateTime(Clock time) {
    	if(null == time) {
        	//System.err.println("TIME shoulde not be NULL");
        	throw new RuntimeException("TIME shoulde not be NULL");
        	
        }
    }
}
