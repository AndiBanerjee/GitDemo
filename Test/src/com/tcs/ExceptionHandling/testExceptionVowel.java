package com.tcs.ExceptionHandling;

import java.util.Scanner;

class CheckVowel{
	public void checkVowelString(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|s.charAt(i)=='e'|s.charAt(i)=='i'|s.charAt(i)=='o'|s.charAt(i)=='u')
				continue;
			else 
				try {
					throw new VowelException("Consonant present");
				}
				catch(Exception E) {
				System.out.println("the string should only have vowels\n"+E);
				}
			break;
		}
	}
}
class VowelException extends Exception{
	public VowelException(String str) {
		super(str);
	}
}
public class testExceptionVowel {
	
		public static void main(String args[]){
			
			String Name=null;
			Scanner sc=new Scanner(System.in);
			CheckVowel c=new CheckVowel();
			System.out.println("enter the String");
			Name=sc.nextLine();
			c.checkVowelString(Name);

	}
}