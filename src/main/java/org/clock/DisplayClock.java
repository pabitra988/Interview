package org.clock;
public interface DisplayClock {
   public Integer HR_5 = 5 ,HR_1 = 1 , MIN_5 = 5,MIN_1 =1 ,ROW_HR_SIZE = 4, ROW_5_MIN = 11 ,ROW_1_MIN =4;
 
void setNextRow(DisplayClock nextRow);
void display(Clock time);
}
