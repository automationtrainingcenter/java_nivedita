package abstraction;
// by default all the methods in Interface are public and abstract
// by default all the properties in interface are public static and final
public interface InterfaceDemo {
//	public static final int i = 10;
	int i = 10;
	
//	public abstract void methodOne();
	void methodOne();
	
	void methodTwo();
	
	void methodThree();
	
	public static void staticMethod() {
		System.out.println("static method of interface");
	}
	
	public default void defaultMethod() {
		System.out.println("default method of interface");
	}

}
