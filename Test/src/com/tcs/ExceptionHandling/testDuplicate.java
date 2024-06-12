package com.tcs.ExceptionHandling;

import java.util.Scanner;
class DuplicateException extends Exception{
	public DuplicateException(String str) {
		super(str);
	}
}
public class testDuplicate {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the array elements");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			for(int j=0;j<5;j++) {
				if(j!=i) {
					try {
					if(a[j]==a[i])
						throw new DuplicateException("Duplicate entry is not allowed");
					}
					catch(Exception E) {
						System.out.println("entries are to be unique"+E);
					}
				}
			}
		}
	}
}
