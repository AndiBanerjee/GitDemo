package testGit;

public class TrackChange {
	int a=5;
	int b=6;
	public void calculateSum() {
		int r=a+b;
	}
	public void calculateSub() {
		int s=a-b;
		System.out.println("the sub value is :"+s);
	}
	public void calculateMul() {
		int m=a*b;
		System.out.println("the mul value is :"+m);
	}
	public void calculateDiv() {
		int d=a/b;
		System.out.println("the div value is :"+d);
	}

	public void branchMethod1() {
		System.out.println("new branch code1");
	
	}


	
	public void branchMethod2() {
		System.out.println("new branch code2");
	
	}
}
