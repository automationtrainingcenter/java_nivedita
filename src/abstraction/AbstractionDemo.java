package abstraction;

/*
 * Abstraction means hiding implementation details of methods.
 * We can achieve abstraction either by abstract classes or interfaces
 * Abstract class (0-100%)
 * 	It is a class with at least one abstract method.
 * 	A normal Java class will extends this abstract class and provides
 * implementation for the abstract methods. If this class failed to 
 * provide implementation for any one abstract method then this class also
 * becomes abstract class.
 * 
 * Abstract method is a method without definition.
 * We use abstract keyword to make a class or method as abstract
 * 
 * 
 * Interface (100%)
 * 	In interface all the methods are abstract.
 * 	A normal Java class will implements this Interface abstract methods. If this class 
 * failed to provide implementation for any one abstract method then this class
 * becomes an abstract class.
 * In interface all the methods are public and abstract by default.
 * From Java 8 Interfaces can have default methods and static methods also.
 * 
 * We can't create an instance of abstract class or interface
 * 
 */
public class AbstractionDemo {
	
	public static void main(String[] args) {
		AbstractClassParent pObj = new AbstractClassChild();
		pObj.methodOne();
		pObj.methodTwo();
		pObj.methodThree();
//		InterfaceDemo.i = 20;
		
		InterfaceDemo idObj = new InterfaceImpl();
		idObj.methodOne();
		idObj.methodTwo();
		idObj.methodThree();
		//we can access default method of an interface using interface object refernce
		idObj.defaultMethod();
		//we can access static method of an interface using Interface name
		InterfaceDemo.staticMethod();
		
		
		InterfaceTwo i2Obj = new InterfaceImpl();
		i2Obj.i2MethodOne();
		i2Obj.i2MethodTwo();
		i2Obj.methodThree();
		((InterfaceDemo)i2Obj).methodOne();
		((InterfaceDemo)i2Obj).methodTwo();
		
		//functional interface object reference using normal class implementation
		MyFunctionalInterface fiNorObj = new FunctionalIntefaceImpl();
		fiNorObj.defaultMethod();
		fiNorObj.methodOne();
		
		
		//functional interface object reference using anonymous class
		MyFunctionalInterface fiAnsObj = new MyFunctionalInterface() {
			
			@Override
			public void methodOne() {
				System.out.println("method one implementation using anonymous class");
			}
		};
		 
		fiAnsObj.methodOne();
		fiAnsObj.defaultMethod();
		
		
		//functional interface object reference using lambda expression
		MyFunctionalInterface fiLamObj = ()->System.out.println("method one implementation using lambda expression");
		fiLamObj.methodOne();
		fiLamObj.defaultMethod();
		
		FuncInterface f1Obj = (String a, String b) ->  Integer.parseInt(a+b);
		
		FuncInterface f2Obj = (String a, String b) -> {
			int ia = Integer.parseInt(a);
			int ib = Integer.parseInt(b);
			return ia+ib;
		};
		
		System.out.println(f1Obj.method("10", "20")); //1020
		
		System.out.println(f2Obj.method("10", "20")); //30
		
		
		
	}

}
