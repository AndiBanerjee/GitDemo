package PracticeSet;
class Bike{
	int gear,speed;
	public Bike(int gear,int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	void applyBrake(int brake) {
		speed=speed-brake;
	}
	void applySpeed(int increment) {
		speed=speed+increment;
	}
	public String toString() {
		return "gear is "+gear+"speed is "+speed;
	}
}
class MountainBike extends Bike{
	int seatHeight;
	public MountainBike(int gear,int speed,int height) {
		super(gear,speed);
		seatHeight=height;
		}
	@Override public String toString() {
		return super.toString()+"SeatHeight is "+seatHeight;
	}
	
}
public class InheritanceBikePrac2 {
	public static void main(String []args) {
		MountainBike mb=new MountainBike(3,100,15);
		mb.applySpeed(30);
		mb.applySpeed(20);
		mb.applyBrake(10);
		System.out.println(mb.toString());
	}
}
