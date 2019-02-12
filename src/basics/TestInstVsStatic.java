package basics;

public class TestInstVsStatic {
	
	public static void main(String[] args) {
		//create an object of InstanceVsStatic
		InstanceVsStatic obj1 = new InstanceVsStatic();
		//accessing instance variable
		obj1.name = "uday";
		
		//accessing static variable
		InstanceVsStatic.IFSCcode  = "HDFC1234D";
		
		//Create another object
		InstanceVsStatic obj2 = new InstanceVsStatic();
		obj2.name = "ramakoti";
		obj2.display();
		//Create another object
		InstanceVsStatic obj3 = new InstanceVsStatic();
		obj3.name = "nivedita";
		
		obj2.name = "srikath";
		
		InstanceVsStatic.IFSCcode = "HDFC9876G";
		
		obj1.display();
		obj2.display();
		obj3.display();
		
	}

}
