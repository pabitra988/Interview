package org.clock;

public class BerlinClock {
	private static HR1DisplayClock hr1Row;
	private static Min5DisplayClock min5Row;
	private static Min1DisplayClock min1Row;
	private static HR5DisplayClock hr5Row ;
    static {
    	hr1Row = new HR1DisplayClock();
    	min5Row = new Min5DisplayClock();
    	min1Row = new Min1DisplayClock();
    	hr1Row.setNextRow(min5Row);
    	min5Row.setNextRow(min1Row);
    	hr5Row = new HR5DisplayClock();
    }
	public static void displayBerlinClock(String time) {
		if("".trim()==time || time.length()==0 || time.split(":").length<3) {
	          System.out.println("Eneter A Valid Time");	
	          return;
	    } 
		Clock clock = new Clock(time);
		
				hr5Row.setNextRow(hr1Row);
				hr5Row.display(clock);

	}

}
