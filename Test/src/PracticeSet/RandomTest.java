package PracticeSet;
 import static java.lang.Math.*;
class Parent{
	int a=9;
	static float f=45.89f;
}
class Child extends Parent{
	public  void GFG(){
		a=55;
		f=90.56f;
		System.out.println(a);
		System.out.println(f);
	}
}
public class RandomTest {
	public static void main(String args[]) {
			System.out.println(sqrt(25));
			Child c=new Child();
			c.GFG();
			
//		String normal="?85O89*69R65*87O104*33I1043";//length 13;0-12 index;
//		 char a,b='k';
//	     int c,d=0;
//	      String s="",s1="",s2="";
//	      int length=normal.length();
//	      char A[]=new char[length];
//	      Boolean z;
	      //System.out.println(length);
	      /*  char B[]=new char[length];
	        for(int i=0;i<length;i++) {
	            a=normal.charAt(i);
	            c=a;
	            if(c>=65 & c<=90)
	                c=c+32;
	            else
	                c=c-32;
	            b=(char)c;
	            A[i]=b;
	        }
	        normal=String.valueOf(A);
	        
	        StringBuilder str=  new StringBuilder(normal);
	        StringBuilder rev=str.reverse();
	        normal=rev.toString();
	        System.out.println(normal);
	        A=normal.toCharArray();
	        for(int i=0;i<length;i++) {
	        	
	            a=normal.charAt(i);
	            c=a;
	            if(c==0)
	                c='*';
	            b=(char)c;
	            A[i]=b;
	        }
	        
	        normal=String.valueOf(A);
//	        System.out.println(A);
	        A=normal.toCharArray();
	       for(int i=0;i<length;i++) {
	        	if(i%2==0) {
	        		a=normal.charAt(i);
	        		c=a;
	        		s=s+c;
	        	}
	        	else {
	        		a=normal.charAt(i);
	        		s=s+a;
	        	}
	        }
	       
	      */
	        
	      
	        	//REMOVING 3 AT THE END OF THE STRING nomal
	        //	normal.getChars(0, (length-1), A, 0);
//	      		s=normal.substring(0,length-1);
//	      		System.out.println(s);
//	      		length=s.length();
//	      		A=s.toCharArray();
//	      		for(int i=0;i<length;) {
////	      			z=Character.isDigit(A[i]);
//	      			if(Character.isDigit(A[i])) {
////	      				System.out.println(A[i]);
//	      				while(Character.isDigit(A[i])) {
//	      					s2=s2+A[i];
//	      					
//	      					i=i+1;
//	      					if(i==26)
//	      						break;
//	      					
//	      				}
//	      				c=Integer.parseInt(s2);
//	      				b=(char)c;
//	      				s1=s1+b;
//	      				s2="";
//	      			}
//	      			else {
//	      				s1=s1+A[i];
//	      				i=i+1;
//	      				
//	      			}
//	      			
//	      		}
//	      		System.out.println(s1);
//	      		length=s1.length();
//	      		A=s1.toCharArray();
//	      		for(int i=0;i<length;i++) {
//	      			if(A[i]=='*') {
//	      				A[i]=' ';
//	      			}
//	      		}
//	      		s1=String.valueOf(A);
//	      		System.out.println(s1);
//	      		StringBuilder str=  new StringBuilder(s1);
//		        StringBuilder rev=str.reverse();
//		        s1=rev.toString();
//		        System.out.println(s1);
//		        for(int i=0;i<length;i++) {
//		        	if(Character.isLetter(s1.charAt(i))) {
//		            a=s1.charAt(i);
//		            c=a;
//		            if(c>=65 & c<=90)
//		                c=c+32;
//		            else
//		                c=c-32;
//		            b=(char)c;
//		            A[i]=b;
//		        	}
//		        	else
//		        		A[i]=s1.charAt(i);
//		        }
//		        s1=String.valueOf(A);
//		        System.out.println(s1);
////	        	s=String.valueOf(A);
////	        	System.out.println(s);
//	        	
//	        	//replacing with the alphabets corresponding to ASCII 
//	        	/*for(int i=0;i<(length-1);i++) {
//		        	
//		        		a=A[i];
//		        		System.out.println(a);
//		        		if(!Character.isDigit(a)) {
////		        		if(a!='0'& a!='1'& a!='2' & a!='3'&a!='4'&a!='5'&a!='6'&a!='7'&a!='8'&a!='9') {
////		        			System.out.println("inside first if");
//		        			c=(int)a;
//		        			s1=s1+c;
//		        		
//		        		
//		        			b=a;
//		        			c=(int)b;
////		        			System.out.println(c);
//		        			s1=s1+c;
//		        		
//		        	}
//		        	else {
//		        		a=A[i];
//		        		s1=s1+a;
//		        	}	
//		        }
//	        	System.out.printf(s1);*/
//	        	/*
//	        	A=s.toCharArray();
//	        	for(int i=0;i<length;i++) {
//		        	
//	        		a=A[i];
//		            c=a;
//		          
//		            if(c==32) 
//		            	c='*';
//			         b=(char)c;
//			         A[i]=b;
//			       
//		         	
//		        }
//	        	normal=String.valueOf(A);
//	        	System.out.println(normal);
//	        	StringBuilder str=  new StringBuilder(normal);
//		        StringBuilder rev=str.reverse();
//		        normal=rev.toString();
//		        System.out.println(normal);
//		        A=normal.toCharArray();
//		        
//		        for(int i=0;i<length;i++) {
//		        
//		            a=normal.charAt(i);
//		            if(a!='1'|a!='2'|a!='3'|a!='4'|a!='5'|a!='6'|a!='7'|a!='8'|a!='9') {
//		            c=a;
//		            if(c>=65 & c<=90)
//		                c=c+32;
//		            else
//		                c=c-32;
//		            b=(char)c;
//		            A[i]=b;
//		        	}
//		        }
//		        normal=String.valueOf(A);
//		        System.out.println(normal);*/
	}     
	
}
