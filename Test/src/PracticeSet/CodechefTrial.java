package PracticeSet;

public class CodechefTrial {

	public static void main(String[] args) {
		String s="3 3";
		char a=s.charAt(0);
		char b=s.charAt(2);
		String c=Character.toString(a);
		String d=Character.toString(b);
		int i=Integer.parseInt(c);
		int j = Integer.parseInt(d);
		System.out.println(i+" "+j);
		int clearDays=0;
		System.out.println(i+" "+j);
		if((i>=0 & i<=7)&(i+j>=0 & i+j<=7)){
		    clearDays=7-(i+j);
		}
        System.out.println(clearDays);
        System.out.println("clearWeeks");//just test purpose

	}

}
