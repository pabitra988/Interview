package org.clock;
public class Clock {
	
	public String hr,min,sec;
	
	public Clock(String time) {
	 String[]	arTime = time.split(":");
	 this.hr = arTime[0];
	 this.min = arTime[1];
	 this.sec = arTime[2];
	}
	

	
	public String getHr() {
		return hr;
	}

	public void setHr(String hr) {
		this.hr = hr;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "Clock [" + hr + ":" + min + ":" + sec + ":";
	}
	

}
