package com.tcs.ExceptionHandling;

import java.util.Scanner;

class OddArgumentCheck {

	public void checkOdd(int a) {
		try {
			if(a%2!=0)
				throw new OddException("The argument is an odd number");
			else
				System.out.println("the input is as expected");
		}
		catch(Exception e) {
			System.out.println("The value for a is expected to be even\n"+e);
			
		}
	}
	
}
class OddException extends Exception{
	public OddException(String str) {
		super(str);
	}
}
class questionTwoW3{
	public static void main (String args[]) {
		int a;
		Scanner sc=new Scanner(System.in);
		OddArgumentCheck O=new OddArgumentCheck();
		System.out.println("enter value for a");
		a=sc.nextInt();
		O.checkOdd(a);
	}
}