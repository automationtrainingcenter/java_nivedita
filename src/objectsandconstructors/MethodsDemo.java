package objectsandconstructors;
/*
 * method without input and without output
 * method without input and with output
 * method with input and without output
 * method with input and with output
 * 
 * syntax:
 * access_modifiers (static) return_type  method_name(arg1, arg2, arg3 .... argN){
 * 		statements;
 * 		statements;
 * 
 * 		return statement;
 * }
 * 
 * both arguments and return type are optional based on your type of the method
 * 
 * static method (outside the class)
 * 
 * data_type_of_return_type var_name = class_name.method_name(para1, para2, para3 ... paraN);
 * 
 * instance method (outsdie the class)
 * data_type_of_return_type var_name = object_of_class.method_name(para1, para2, para3 ... paraN);

 */

public class MethodsDemo {
	
	//method without input without output
	public void methodOne() {
		System.out.println("method one without input and without output");
	}
	
	
	//method without input and with output
	public boolean methodTwo() {
		System.out.println("method two without input and with boolean output");
		return true;
	}
	
	//method with input and without output
	public void methodThree(int a, int b) {
		System.out.println("method with two integer inputs and without output");
		System.out.println("input 1 is "+a+" input 2 is "+b);
	}
	
	//method with input and with output
	public boolean methodFour(int a, int b) {
		System.out.println("method with two integer input and with a boolean output");
		System.out.println("input 1 is "+a+" input 2 is "+b);
		return true;
	}
	
	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo();
		obj.methodOne();
		boolean result = obj.methodTwo();
		System.out.println("output is "+result);
		obj.methodThree(10,  20);
		boolean m4Result = obj.methodFour(10, 20);
		System.out.println("output is "+m4Result);
		
	}
	
}
