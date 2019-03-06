package abstraction;

//to create a functional interface we have to @FunctionalIterface annotation

@FunctionalInterface
public interface MyFunctionalInterface {
	void methodOne();
	
	public default void defaultMethod() {
		System.out.println("default method");
	}
}
