package PracticeSet;
class Vehicle{
	public void drive() {
		System.out.println("Vehicle is ready to drive");
	}
}
class Car extends Vehicle{
	public void drive() {
		System.out.println("Repairing a car");
	}
}
public class Inheritance_Prac3 {
	public static void main(String args[]) {
		Car c=new Car();
		c.drive();
	}
}
