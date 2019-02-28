package inheritance;
/*
 * Inheritance means acquiring the properties and behavior (methods) of one class (parent or super or base)in 
 * another class (child or sub). The main advantage of Inheritance is code re-usability
 * 
 * There are 5 types of inheritance in Java
 * 
 * single: single parent and single child. A -> B
 * multilevel: parent and child and sub child. A->B->C
 * Hierarchical: single parent and multiple child. A->B A->C
 * multiple: multiple parent and single child. A->C B->C
 * Hybrid: combination hierarchical and multiple. 
 * 
 * 
 * multiple and hybrid inheritance is not possible directly in Java.
 * 
 * Inside the child class we can access Parent class properties and methods directly and outside the child class
 * By creating a child class object we can access parent class properties and methods
 * 
 * To achieve inheritance we have to use extends keyword
 * 
 * child class extends parent class
 * 
 * super keyword always represents the parent class instance. 
 */ 

public class InheritanceDemo {
	
	public static void main(String[] args) {
		//single
		ChildOne c1Obj = new ChildOne();
		c1Obj.methodTwo(); // childOne
		c1Obj.methodOne(); // parent
		
		/*
		 * By creating Parent class object we can't access child class methods even we type casted Parent object
		 * to Childclass
		 */
		Parent pObj = new Parent();
		pObj.methodOne();
//		((ChildOne) pObj).methodTwo();
		
		
		/*
		 * By creating Parent class Object reference and Object creation to Child class then we can call
		 * child class methods using Parent class object reference by type casting Parent Object to child class
		 */
		Parent pcObj = new ChildOne();
		pcObj.methodOne();
		((ChildOne) pcObj).methodTwo();
//		ChildOne cObj = (ChildOne)pcObj;
//		cObj.methodTwo();
		
		
		//multi level inheritance
		SubChild scObj = new SubChild();
		scObj.methodThree(); //SubChild class
		scObj.methodTwo(); //ChildOne class
		scObj.methodOne(); //Parent class
		
		
		//hierarachical inheritance
		ChildOne cOneObj = new ChildOne();
		cOneObj.methodOne();
		cOneObj.methodTwo();
		
		ChildTwo cTwoObj = new ChildTwo();
		cTwoObj.methodFour();
		cTwoObj.methodOne();
		
		
		
	}

}
