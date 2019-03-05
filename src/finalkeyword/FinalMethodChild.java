package finalkeyword;

public class FinalMethodChild extends FinalMethodParent{
	
	@Override
	public void normalMethod() {
		System.out.println("normal method overriden in child class");
	}
	
	//it will through compilation error we can't override final method 
//	@Override
//	public void methodOne() {
//		
//	}
}
