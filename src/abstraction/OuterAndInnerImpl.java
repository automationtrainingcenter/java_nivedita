package abstraction;

public class OuterAndInnerImpl implements Outer, Outer.Inner{

	@Override
	public String methodOne() {
		System.out.println("outer interface method one");
		return "Surya";
	}

	@Override
	public void methodTwo() {
		System.out.println("inner interface method two");
	}

	@Override
	public Inner method() {
		return this;
	}

}
