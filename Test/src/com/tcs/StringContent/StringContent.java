package com.tcs.StringContent;

public class StringContent {
	public static void main(String args[]) {
		boolean a=true;
		String str ="I love Java";
		String str2="kkk";
		int count=0;
		int l=str.length();
		int l2=str2.length();
		for(int i=0;i<l;i++) {
			for(int j=0;j<l2;j++) {
				if(str.charAt(i)==str2.charAt(j)) {
					j=l2;
					count++;
				}
			}
		}
		System.out.println(count);
		if(count>=l2)
			System.out.println("found");
		else
			System.out.println("not found");
		//a=ValidateString(str,str2);
		
				
	}
	/*public static boolean ValidateString(String str,String str2) {
		//return str.matches("(.*)love(.*)");//way to check that if str contain "love"
		boolean result=str.contains(str2);//way to check if str contains str2
		if(result)
			return true;
		else 
			return false;
	}*/
	
}
