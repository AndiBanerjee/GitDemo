package com.tcs.testCodeInterface;
/*Interface under 1 class-how to access the Interface fields*/
class D{
	interface Write{
		
		 int i=8;
		 
		}
	
	}
public class InterfacePractice1_InterfaceUnder1Class {
	
	
		public static void main(String [] args) {
			 System.out.println(D.Write.i);		
		}
	}

