package PracticeSet;

//class SplitString{
//	public void split_name(String name) {
//		int length=name.length();
//		String resultArrayOfString="Tinni";
//		resultArrayOfString=resultArrayOfString+'b';
//		System.out.println(resultArrayOfString);
//		char A[],B[]=new char[100];
//		A=name.toCharArray();
//		for (int i=0;i<length;i++) {
//			if(A[i]!='_') {
//				B[i]=A[i];
//			}
//			else {
//					System.out.print(B);
//					B=new char[100];
//					i=0;
//				
//			}
//		}
//	}
//}
public class Split {
	public static void main(String args[]) {
	String actualString="Geeks_for_Geeks_9078",tempString;
	char [] charArray=new char[30];
	int i1=0,i2=0;
	String[] resultArrayOfString = new String[30];
	for(int i=0;i<actualString.length();i++) {
		if(actualString.charAt(i)!='_') {
			charArray[i1++]=actualString.charAt(i);
		}
		else {
			tempString=new String(charArray);
			resultArrayOfString[i2++]=tempString;
			charArray=new char[30];
			i1=0;
		}
	 }
	tempString=new String(charArray);
	resultArrayOfString[i2]=tempString;
	for(int i=0;i<=i2;i++) {
		System.out.println(resultArrayOfString[i]);
		}
	}	
}
//		for(String d:resultArrayOfString) {
//			System.out.println(d);
//		}
//	for(int i=0;i<11;i++) {
//		if(actualString.charAt(i)!='_') {
//			
//			charArray[i1++]=actualString.charAt(i);
//		}
//		else {
//			System.out.println(charArray);
//			charArray=new char[15];
//			i1=0;
//			}
//		}
	
//	System.out.println(resultArrayOfString[0]+resultArrayOfString[1]+resultArrayOfString[2]);
	
