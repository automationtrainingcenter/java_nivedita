package objectsandconstructors;

//Student class

public class ObjectDemo {

	// properties
	int id;
	String name;
	String address;
	long phNum;
	String course;
	double fee;
	double balance;

	// setDetails
	public void setDetails(int i, String n, String a, long pn, String c, double f) {
		id = i;
		name = n;
		address = a;
		phNum = pn;
		course = c;
		fee = f;
		balance = fee;
	}

	// update address
	public void updateAddress(String newAddress) {
		address = newAddress;
	}

	// update phone number
	public void updatePhoneNumber(long newPhNum) {
		phNum = newPhNum;
	}

	// fee payment
	public void payFee(double amount) {
		if (balance == 0) {
			System.out.println("total fee paid");
		} else {
			balance -= amount;
		}
	}

	public static void main(String[] args) {
		ObjectDemo obj1 = new ObjectDemo();
		obj1.setDetails(101, "nivedita", "hudacolony", 9876543210l, "testing", 9000.00);

		System.out.println(obj1.name);
		obj1.payFee(9000);
		System.out.println(obj1.balance);
		obj1.payFee(5000);
		System.out.println(obj1.balance);
	}

}
