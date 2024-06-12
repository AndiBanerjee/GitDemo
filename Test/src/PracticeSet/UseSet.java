package PracticeSet;

import java.util.HashSet;
import java.util.Set;

public class UseSet {
	public static void main(String args[]) {
		Set<String> name= new HashSet<String>();
		name.add("A");
		name.add("N");
		name.add("I");
		name.add("N");
		name.add("D");
		name.add("I");
		name.add("T");
		name.add("A");
		for(String i : name)
			System.out.println(i);
	}
}
