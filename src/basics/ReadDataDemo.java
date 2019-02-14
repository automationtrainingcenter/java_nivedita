package basics;

import java.util.Scanner;

/*
 * To read data from the console we have Scanner class in Java which will have several methods to 
 * read different types of data from any type of Input. 
 */

public class ReadDataDemo {

	public static void main(String[] args) {
		// create object of the Scanner class
		Scanner s = new Scanner(System.in);

		// read string value
		System.out.println("enter your name");
		String name = s.next();
		System.out.println("name is " + name);
		
		// read integer data
		System.out.println("enter a number");
		int i = s.nextInt();
		System.out.println("number you entered is " + i);

		// read a double data
		System.out.println("enter a double number");
		double d = s.nextDouble();
		System.out.println("double value you entered is  " + d);
		
		//read a boolean data
		System.out.println("enter a boolean value");
		boolean bool = s.nextBoolean();
		System.out.println("boolean value si "+bool);
		

	}

}
