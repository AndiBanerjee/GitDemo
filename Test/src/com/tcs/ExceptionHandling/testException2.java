package com.tcs.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Checked exception*/
public class testException2 {
	public static void main(String args[]) {
	BufferedReader b= new BufferedReader(new InputStreamReader(System.in));	
	int r=1,a = 6,c = 0;
	
	try {
		System.out.println("enter the valur for c");
		c=Integer.parseInt(b.readLine());
		r=a/c;
		}
	catch(IOException I){
		System.out.println("Some IO error");
	}
	System.out.println(r);
	}
}