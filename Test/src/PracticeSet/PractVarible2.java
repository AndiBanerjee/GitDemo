package PracticeSet;

public class PractVarible2 {
	public static void main(String args[]) {
		int divisor=2,dividend=109,modulus;
		double quotient,resultInPoint;
		quotient=(double)dividend/divisor;
		modulus=dividend%divisor;
		System.out.println("result is \n"+quotient+"\n"+modulus);
//		quotient=101/0;
		System.out.println(Double.isFinite(100/2));
//		resultInPoint=quotient+(modulus/divisor);
//		System.out.println("the result is \n"+resultInPoint);
	}
}
