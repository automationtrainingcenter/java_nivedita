package basics;

/*
 * In java we have mainly two types of data types
 * 1. primitive
 * 		boolean either true or false - Boolean
 * 		char which will store single character - Character
 *		byte store integer values - Byte
 *		short store integer values - Short
 *		int store integer values -Integer
 *		long store integer values - Long
 *		float store floating point number -Float
 *		double store floating point number - Double
 * 	
 * 2. reference
 * 		Arrays
 * 		Strings
 * 
 *  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
 * are known as Wrapper classes. These are used to perform different operations on data.
 * 		1. Boolean
 * 		2. Character
 * 		3. Byte
 * 		4. Short
 * 		5. Integer
 * 		6. Long
 * 		7. Float
 * 		8. Double
 * 
 * 	WCData_type obj_name = new WCData_type(value);
 * 
 * 	Type Casting: converting one type of data to another type of data
 * 	up casting: lower memory type to higher memory type : widening : no data loss
 * 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
 * 
 * 	Converting primitive data type to wrapper class: boxing
 *  Converting wrapper to primitive : un-boxing
 * 
 * 
 * syntax to create primitive data type
 * data-type var-name  = value; //initialization
 * data-type var-name; //declaration
 * var-name = value; //assignment to the variable which is already declared
 * 
 * variable is nothing but name of memory location where we are storing data
 */

public class DatatypesDemo {
	
	public static void main(String[] args) {
		//boolean
		boolean b = true;
		System.out.println("boolean value is "+b);
		
		
		//byte
		byte by = 123;
		System.out.println("******************** Byte Variable **************************");
		System.out.println("byte value is "+by);
		System.out.println("size of byte variable is "+Byte.SIZE);
		System.out.println("size of byte variable in bytes is "+Byte.BYTES);
		System.out.println("minimum value of the byte variable is "+Byte.MIN_VALUE);
		System.out.println("maximum value of the byte variable is "+Byte.MAX_VALUE);
		
		//short
		short sh = 12345;
		System.out.println("******************** Short Variable **************************");
		System.out.println("short value is "+sh);
		System.out.println("size of short variable is "+Short.SIZE);
		System.out.println("size of short variable in bytes is "+Short.BYTES);
		System.out.println("minimum value of the short variable is "+Short.MIN_VALUE);
		System.out.println("maximum value of the short variable is "+Short.MAX_VALUE);
		
		//int 
		int i = 123456;
		System.out.println("******************** Integer Variable **************************");
		System.out.println("int value is "+i);
		System.out.println("size of integer variable is "+Integer.SIZE);
		System.out.println("size of integer variable in bytes is "+Integer.BYTES);
		System.out.println("minimum value of the integer variable is "+Integer.MIN_VALUE);
		System.out.println("maximum value of the integer variable is "+Integer.MAX_VALUE);
		
		
		//long
		long l = 12345678999l;
		System.out.println("******************** Long Variable **************************");
		System.out.println("long value is "+l);
		System.out.println("size of long variable is "+Long.SIZE);
		System.out.println("size of long variable in bytes is "+Long.BYTES);
		System.out.println("minimum value of the long variable is "+Long.MIN_VALUE);
		System.out.println("maximum value of the long variable is "+Long.MAX_VALUE);
		
		
		//float
		float f = 12.22f;
		System.out.println("******************** Float Variable **************************");
		System.out.println("float value is "+f);
		System.out.println("size of float variable is "+Float.SIZE);
		System.out.println("size of float variable in bytes is "+Float.BYTES);
		System.out.println("minimum value of the float variable is "+Float.MIN_VALUE);
		System.out.println("maximum value of the float variable is "+Float.MAX_VALUE);
		
		
		//double 
		double d = 123.4444;
		System.out.println("******************** double Variable **************************");
		System.out.println("double value is "+d);
		System.out.println("size of double variable is "+Double.SIZE);
		System.out.println("size of double variable in bytes is "+Double.BYTES);
		System.out.println("minimum value of the double variable is "+Double.MIN_VALUE);
		System.out.println("maximum value of the double variable is "+Double.MAX_VALUE);
		
		//char: In java character occupies two byte of memory becuase it supports unicode formatting
		char ch  = 'a';
		System.out.println("******************** Character Variable **************************");
		System.out.println("character value is "+ch);
		System.out.println("size of character variable is "+Character.SIZE);
		System.out.println("size of character variable in bytes is "+Character.BYTES);
		System.out.println("minimum value of the character variable is "+Character.MIN_VALUE);
		System.out.println("maximum value of the character variable is "+Character.MAX_VALUE);
		
		//upcasting: lower to higher
		short shL = 12345;
		int iH = shL;
		System.out.println(iH);
		
		//downcasting: higher to lower
		//lower_data_type var_name = (lower_data_type) higher_data_type_var_name
		
		short shH = 128;
		byte byL = (byte) shH;
		System.out.println(byL);
		
		//converting primitive to wrapper type
		int ip = 12;
		Integer iw = Integer.valueOf(ip);
		System.out.println(iw);
		
		double dp = 12.333;
		Double dw = Double.valueOf(dp);
		
		
		//conversion of wrapper type to primitive type
		Integer iwp = new Integer(12345);
		int ipr = iwp.intValue();
		
		Float fw = new Float(12.33f);
		float fp = fw.floatValue();
		
		
		//primitive to reference
		//integer to string
		String is = Integer.toString(ip);
		System.out.println(is+10);
		
		String fs = Float.toString(fp);
		System.out.println(fs+10);
		
		//String to double
		String pi = "3.14";
		System.out.println(pi+10);
		double ds = Double.parseDouble(pi);
		System.out.println(ds+10);
		
		String si = "1223556688";
		int istr = Integer.parseInt(si);
		System.out.println(istr+10);
		
		
		
	}

}
