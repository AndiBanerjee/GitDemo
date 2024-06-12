package PracticeSet;
//Easy
class Rotation{
	int B[]=new int[5];
	int[] ClockRotation(int A[]) {
		int length,tempVar;
		length=A.length;
		tempVar=A[length-1];
		for(int i=length-2;i>=0;i--){
			B[i+1]=A[i];
		}
		B[0]=tempVar;
		return B;
		
	}
}

public class ArrayRotation {

	public static void main(String[] args) {
		int A[]= {1,2,3,4,5};
		Rotation obj=new Rotation();
		int B[]=obj.ClockRotation(A);
		for(int i=0;i<B.length;i++)
			System.out.println(B[i]);
		}
}
