package collections;
/*
 * Set is also a inbuilt data structure in Java
 * Set does not allow duplicate values
 * Set is not index based
 * Set is an interface and it is implemented by 
 * HashSet it will not maintain any order of the data
 * LinkedHashSet will maintain the insertion order
 * TreeSet will maintain ascending order for numeric data and alphabetical order for character or string data
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
//		Set<String> students = new HashSet<>();
//		Set<String> students = new LinkedHashSet<>();
		Set<String> students = new TreeSet<>();
		
		//add the data to the set
		students.add("neha");
		students.add("srikanth");
		students.add("Surya");
		students.add("Satish");
		students.add("aravind");
		
		//number of elements in a set
		System.out.println(students.size());
		
		//print the data of the set
		System.out.println(students);
		
		//we can retrieve data using for each loop
		for(String student  : students) {
			System.out.println(student);
		}
		
		//we can reteive data using iterator interface
		Iterator<String> it = students.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		// search for an element in a set
		System.out.println(students.contains("neha"));
		
		//remove the data from the set
		students.remove("satish");
		System.out.println(students);
		
		
		//remove all the value from the set
		students.clear();
		System.out.println(students);
		
	}
}
