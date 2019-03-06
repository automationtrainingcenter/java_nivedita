package abstraction;

public class InterfaceImpl implements InterfaceDemo, InterfaceTwo {

	@Override
	public void methodOne() {
		System.out.println("method one");
	}

	@Override
	public void methodTwo() {
		System.out.println("method two");
	}

	@Override
	public void methodThree() {
		System.out.println("method three");
	}

	@Override
	public void i2MethodOne() {
		System.out.println("i2 method one");
	}

	@Override
	public void i2MethodTwo() {
		System.out.println("i2 method two");
	}
	
	@Override
	public void defaultMethod() {
		System.out.println("overriding the default method of interface");
	}
	
	
	

}
