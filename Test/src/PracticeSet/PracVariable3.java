package PracticeSet;

import java.util.Scanner;

public class PracVariable3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the desired number");
		int num=sc.nextInt();
		int count=0,length;
		while(num/10!=0) {
			count++;
			System.out.println(num%10);
			num=num/10;
			}
		System.out.println(num);
	}
}
