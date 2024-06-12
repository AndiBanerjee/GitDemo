package com.tcs.ExceptionHandling;
/*Try with multiple catch with finally*/
public class TestException_trycatchIntro {
	public static void main(String args[]) {
		int a[]={1,2,3,4};//declaration+initialization
		String s=new String();//??
		int b[]=new int[6];//
		int[] c=new int[] {8,9,0,6};//	
		try {
			for(int i=0;i<=6;i++) {
				System.out.println(a[i]);
			}
		}
		catch(ArithmeticException E) {
			System.out.println("A number cannot be divided by 0");
		}
		catch(ArrayIndexOutOfBoundsException E) {
			System.out.println("Array index out of bound exception ...."+E);
		}
		catch(Exception E) {
			System.out.println("other exception block");
		}
		finally {
			System.out.println("I am from finally block");
		}
		
		
		System.out.println("after catch first block");
		
		System.out.println("after catch second block");
	}
}
