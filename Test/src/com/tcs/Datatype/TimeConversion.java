package com.tcs.Datatype;

public class TimeConversion {
	int hour,minutes,IST,GMT;
	int diff=330,quotient,remainder,format=24;
	String day="AM";
	public void Conversion(int hour,int minutes) {
		this.hour=hour;
		this.minutes=minutes;
		System.out.println("The GMT converted time:");
		if(hour>=12)
			day="PM";
		if(hour>23 | minutes>59)
			System.out.println("Invalid en try");
		else if(hour>=00 & hour<=4) 
			hour=hour+12;
		IST=(hour*60)+minutes;
		GMT=IST-diff;
		if (GMT<0) {
			GMT=-(GMT);
			minutes=60-GMT;
		}
		quotient=GMT/60;
		remainder=GMT%60;
		System.out.println((quotient)+" " +"hour"+" "+remainder+" "+"minutes");
		/*if((hour>=0 & hour<=5) & (minutes>=00 & minutes<=29))
			System.out.println((quotient+12)+" " +"hour"+" "+remainder+" "+"minutes");*/
		/*else if((hour>=05 | hour<=11) & (minutes>=30 | minutes<=59))
			System.out.println((quotient)+" " +"hour"+" "+remainder+" "+"minutes");
		else if((hour>=12 | hour<=17) & (minutes>=00 | minutes<=29))
			System.out.println((quotient)+" " +"hour"+" "+remainder+" "+"minutes");
		else if((hour>=17 | hour<=23) & (minutes>=30 | minutes<=59))
			System.out.println((quotient+12)+" " +"hour"+" "+remainder+" "+"minutes");*/
		
	}
}

class Main{
	public static void main(String args[]) {
		TimeConversion t=new TimeConversion();
		t.Conversion(5,29);
	}
}
