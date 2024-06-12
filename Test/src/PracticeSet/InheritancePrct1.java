package PracticeSet;
//Easy
//query--variable reuse/variable override??
class Animal{
	public String sound,name;
	void makeSound() {
		sound="AnimalSound";
		name="Animal";
		
	}
	public String toString() {
		return "the sound it makes is"+sound;
		
	}
	
}
class Cat extends Animal{
	
	void makeSound() {
		sound="mewwww";
		name="Cat";
	}
	@Override public String toString() {
		return "This is  a"+name+"the sound it makes is"+sound;
		
	}
}
public class InheritancePrct1 {
	public static void main(String args[]) {
//		Animal a=new Animal();
//		a.makeSound();
//		System.out.println(a.toString());
		Cat c=new Cat();
		c.makeSound();
		System.out.println(c.toString());
		
	}
}
