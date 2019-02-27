package encapuslation;

public class TestEncapsulation {

	public static void main(String[] args) {
		EncapsulationDemo e1 = new EncapsulationDemo("3214567", "uday", "miyapur", 9876543210l, 10000.00);
		System.out.println(e1.getBalance());
//		e1.balance = 0;
		System.out.println(e1.getBalance());
		System.out.println("before " +e1.getPhNum());
		e1.setPhNum(9876544466l);
		System.out.println("after "+e1.getPhNum());
	}

}
