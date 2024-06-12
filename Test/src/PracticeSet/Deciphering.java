package PracticeSet;
//Yet to resolve
public class Deciphering {
	public static void main(String arg[]) {
	String normal="*65Yh?";
	 char a,b='k';
       int c,d=0;
       String s="",s2="";
       int length=normal.length();
       char A[];
       Boolean z;
       A=normal.toCharArray();
      /* char A[]=new char[length];
       A=normal.toCharArray();
       s=String.valueOf(A);
       System.out.println(s);
       System.out.println("--------");
       char B[]=new char[length];
       B=normal.toCharArray();
       B[length-1]=(Character) null;
       s2=String.valueOf(B);
       System.out.println(s2);
       */
      /* b='?';
       c=(int)b;
       System.out.println(c);
       c=65;
       a=(char)c;
       System.out.println(a);*/
       for(int i=0;i<length;) {
    	 
    		   z=Character.isDigit(A[i]);
    		   if(z==true) {
    			   System.out.println("hello");
    		   }
    		   i=i+1;
    	   
       }
      
	}
   		
}
