package exceptions;

/*
 * Exception means interruption to the normal flow of execution.
 * Generally we have two types of exceptions
 * 1. checked exceptions also known compile time exception
 * 		These are the exceptions which will extends Exception class
 * 	 we can handle checked exception either by throwing that exception or by handling that exception using
 * try and catch blacks
 * 2. unchecked exceptions also known as runtime exception
 * 		These are the exceptions which will extends RuntimeException class
 * 	we can handle unchecked exception using try and catch block
 * 
 * try block contains the code which will rise an exception
 * 
 * catch block will catch that exception and handles that exception
 * 
 * finally block will execute the statement irrespective of exception
 * 
 * throws keyword will throw the exception to the corresponding method declaration
 */
public class ExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("first line of code");
		try {
//			System.out.println(10/0);
//			FileInputStream fis = new FileInputStream(".\\config1.properties");
			int[] marks = { 1, 2, 3, 4, 5 };
			System.out.println(marks[1]);
		} catch (Exception e) {
			System.out.println(e.getClass() + " : " + e.getMessage());
		} finally {
			System.out.println("finally block");
		}
		System.out.println("second line of code");
	}

}
