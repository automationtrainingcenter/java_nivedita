package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List is an inbuilt data structure in Java
 * List is index based and index starts from 0
 * List is an Interface in Java and the implementation classes are ArrayList and LinkedList
 * ArrayList it is same as array which will store data in continues memory locations and array list s
 * size is dynamic
 * LinkedList will store data in separate memory locations and keeps track of previous and next elements
 * To store data, retrieve data and search for data ArrayList very fast
 * To remove or insert data at a given index LinkedList very fast
 */
public class ListDemo {

	public static void main(String[] args) {
		// create List interface object reference using ArrayList class
//		List<String> books = new ArrayList<>();

		// create List interface object reference using ArrayList class
		List<String> books = new LinkedList<>();

		// store the data in a list
		books.add("malgudi days");
		books.add("wings of fire");
		books.add("two states");
		books.add("three mistakes of my life");
		books.add("Java for Testers by Alan richerdson");

		// find the number of elements in list
		System.out.println("number of books are " + books.size());

		// how to insert the data
		books.add(2, "jungle book");

		// display the content of list
		System.out.println(books);

		// retrieve the data from a list
		System.out.println(books.get(0));

		// retrieving data from the list using normal for loop
		System.out.println("Retrievig data from the books using for loop");
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}

		System.out.println("Retrievig data from the books using for-each loop");
		for (String book : books) {
			System.out.println(book);
		}
		
		//update the data at a given index
		books.set(0, "Java Black Book");
		

		// search for a book in the list
		System.out.println("wings of fire is in books... " + books.contains("wings of fire"));

		// delete the data from the list using index
		books.remove(1);
		System.out.println(books);

		// delete the data from the list using object
		books.remove("two states");
		System.out.println(books);

		// verify a list empty or not
		System.out.println("books is empty .... " + books.isEmpty());

		// remove all the content from the list
		books.clear();
		System.out.println(books);

		System.out.println("books is empty .... " + books.isEmpty());


	}

}
