package PracticeSet;
class Employee{
	String designation;
	public void work() {
		System.out.println("work");
	}
	public Double salary(String designation) {
		if(designation.equals("IT")) 
			return 5.5;
		
		else if(designation.equals("Manager"))
			return 10.5;
		return null;
					
	}
}
class HRManager extends Employee{
	String s;
	
	public void work() {
		System.out.println("Managing HR");
		super.work();
	}
	public void addEmployee(int i){
		System.out.printf("%d new employees are added",i);
	}
	
}
public class Inheritance_prac4 {
	public static void main(String args[]) {
		HRManager h=new HRManager();
		h.work();
		h.addEmployee(2);
		System.out.println("The salary is:"+h.salary("IT"));
	}
}
