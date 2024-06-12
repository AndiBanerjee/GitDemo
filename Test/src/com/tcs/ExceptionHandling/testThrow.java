package com.tcs.ExceptionHandling;
import java.io.IOException;
import java.util.Scanner;
/*user defined Exception and use of throw*/
public class testThrow {
	 public static void main(String args[])   {
		 int a,b=20,c=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the value for c");
		 c=sc.nextInt();
		 try {
		 if(c>10)
			 throw new Myexception("c is greater than 10");
		 }
		 catch(Exception e){
			 System.out.println("c should be lesser than 10");
		 }
		 a=b/c;
		 System.out.println("the value for a is:"+a);
	 }
}
 class Myexception extends Exception{
	 
	 public Myexception(String str){
		 
		 super(str);	
		 }
	 
 }