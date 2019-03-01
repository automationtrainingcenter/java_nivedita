package inheritance;

public class ChildOne extends Parent{
	
	public ChildOne() {
		super();
		System.out.println("childOne class object created");
	}
	
	public void methodTwo() {
//		methodOne();
		System.out.println("method two child one class");
	}

}
