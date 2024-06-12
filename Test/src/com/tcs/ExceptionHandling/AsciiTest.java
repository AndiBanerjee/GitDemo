package com.tcs.ExceptionHandling;

public class AsciiTest {
	public static void main(String args[]) {
		String normal="Welcome to hackerrank";
		 char a,b='k';
	        int c = 0;
	        String t="ab3cd";
	        String s="";
	       /*System.out.println(t.charAt(2)); 
	        int length=normal.length();
	        char A[]=new char[length];
	        for(int i=0;i<length;i++) {
	        	
	            a=normal.charAt(i);
	            c=a;
	            if(c==32)
	                c='*';
	            b=(char)c;
	            A[i]=b;
	        }
	        System.out.println(A);*/
	        for(int i=0;i<t.length();i++) {
	        	if(i%2==0) {
	        		a=t.charAt(i);
	        		if(a=='3') {
	        			c=(int)a;
	        			s=s+c;
	        		}
	        		s=s+a;
	        		}
	        	else {
	        		a=t.charAt(i);
	        		s=s+a;
	        	}
	        }
	        System.out.println(s);
	}
	
}
