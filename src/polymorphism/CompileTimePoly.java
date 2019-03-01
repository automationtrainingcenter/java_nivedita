package polymorphism;

public class CompileTimePoly {
	
	public String add(int a, String b) {
//		int ib = Integer.parseInt(b);
		return a+b;
	}
	
	// changing type of arguments
	public int add(int a, int b) {
		return a+b;
	}
	
	
	// changing sequence of arguments
	public void add(String a, int b) {
		int ia = Integer.parseInt(a);
		System.out.println(ia+b);
	}
	
	//changing number of arguments
	public void add(int a, String b, int c) {
		int ib = Integer.parseInt(b);
		System.out.println(a+ib+c);
	}
	
//	//changing return type of the method
//	public int add(int a, String b) {
//		
//	}

}
