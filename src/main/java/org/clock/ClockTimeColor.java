package org.clock;
public enum ClockTimeColor {
   DEFAULT("O"),RED("R"),YELLOW("Y");
   private String color ;
   ClockTimeColor(String color) {
	   this.color = color;
   }
   public String getColor() {
	   return this.color;
   }
}
