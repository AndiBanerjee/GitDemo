package com.tcs.Datatype;

import java.util.Scanner;

public class InchestoMeter {
	public void Convert(int Inch) {
		float Meter;
		Meter=(float) (Inch*0.0254);// explicit type casting
		System.out.println("The converted value in meter is:"+Meter);
	}
}
class Solution{
	public static void main(String args[]) {
		
		InchestoMeter I=new InchestoMeter();
		Scanner sc=new Scanner(System.in);
		int Inch;
		System.out.println("enter the value in Inches");
		Inch=sc.nextInt();
		I.Convert(Inch);
	}
}
