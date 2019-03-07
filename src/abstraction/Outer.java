package abstraction;

public interface Outer {
	
	public String methodOne();
	
	public Inner method();
	
	interface Inner{
		public void methodTwo();
	}

}
