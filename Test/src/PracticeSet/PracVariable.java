package PracticeSet;

public class PracVariable {
	public static void main(String args[]) {
		float f=2.2f,nextDn,nextUp;
		double d=2.2,nextDn1,nextUp2;
		nextDn=Math.nextDown(f);
		nextUp=Math.nextUp(f);
		nextDn1=Math.nextDown(d);
		nextUp2=Math.nextUp(d);
		System.out.println("values:\n"+nextDn+"\n"+nextUp+"\n"+nextDn1+"\n"+nextUp2);
	}
}
