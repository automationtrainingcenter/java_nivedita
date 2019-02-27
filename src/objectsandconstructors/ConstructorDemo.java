package objectsandconstructors;
/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */

// this class is Employee class

public class ConstructorDemo {

	int id;
	String name;
	String address;
	long phNum;
	long aadhar;
	String panNum;

	public ConstructorDemo() {
		this.id = 100;
		this.name = "surya";

	}
	
	private ConstructorDemo(String name, String address, long phNum) {
		this.name = name;
		this.address =address;
		this.phNum = phNum;
	}

	public ConstructorDemo(String name, String address, long phNum, long aadhar) {
		this(name, address, phNum);
		this.aadhar = aadhar;
		
	}

	public ConstructorDemo(String name, String address, long phNum, String panNum) {
		this(name, address, phNum);
		this.panNum = panNum;
	}

	public void display() {
		System.out.println("id = " + this.id);
		System.out.println("name = " + this.name);
	}

	public static void main(String[] args) {
		ConstructorDemo e1 = new ConstructorDemo("mythranath", "miyapur", 8765412390l, 1234678954321l);
		e1.display();
		System.out.println(e1.hashCode());

		ConstructorDemo e2 = new ConstructorDemo("ram", "lingampally", 678951230l, "apsh1234f");
		e2.display();
		System.out.println(e2.hashCode());
		
		ConstructorDemo e3 = new ConstructorDemo("uday", "hudacolony", 8765876543l, "avdf4455f");
		System.out.println(e3.hashCode());
	}

}
