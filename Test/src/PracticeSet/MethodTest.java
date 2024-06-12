package PracticeSet;

 class Test {
	 int m;
	public void method1() {
		System.out.println("inside method 1");
	}
	public static void method2() {
		
		System.out.println("inside method 2");
	}
}
public class MethodTest{
	Test obj=new Test();
	public void mainClassMethod() {
		Test.method2();
	}
	public static void main(String args[]) {
		Test.method2();
		MethodTest obj2=new MethodTest();
		obj2.mainClassMethod();
	}
}