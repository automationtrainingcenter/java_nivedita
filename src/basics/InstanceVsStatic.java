package basics;

public class InstanceVsStatic {
	//instance
	String name;
	//static variable
	static String IFSCcode;
	
	public void display() {
		System.out.println("name = "+name);
		System.out.println("IFSC code  = "+IFSCcode);
	}

}
