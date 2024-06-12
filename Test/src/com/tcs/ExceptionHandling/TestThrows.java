package com.tcs.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Application of Throw and Throws*/
public class TestThrows {
	public static void main(String args[]) throws NumberFormatException, IOException  {
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));	
		int r=1,a = 6,c = 0;
		System.out.println("enter the valur for c");
		c=Integer.parseInt(b.readLine());
		r=a/c;
		System.out.println(r);
		
	}
}