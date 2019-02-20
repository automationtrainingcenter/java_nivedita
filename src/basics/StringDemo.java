package basics;
/* String is set of characters.
 * In Java Strings will be stored in a separate memory area known as String Constant Pool
 * Strings are immutable i.e. we can't change String values.
 * 
 *	//declare
 *	String obj_name = new String(string value);
 *	
 *	//string declaration using String literal
 *	String obj_name;
 *	
 *	//assign
 *	 
 *	
 *	//retrieve
 *	using obj_name we can retrieve String data
 *
 *	//initialization
 *	String obj_name = "value";
 *
 * 	String class provides so many methods to manipulate string data
 */ 

public class StringDemo {
	public static void main(String[] args) {
		String s1  = "selenium";
		String s2 = "webdrier";
		String s3 = "selenium";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		s1 = "python";
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		
		s3 = s3 + s2;
		System.out.println(s3);
		System.out.println(s3.hashCode());
	}

}
