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
			System.out.println("Payment successful.");
		}
	}
	
	// display details
	public void displayDetails() {
		System.out.println("name = "+name);
		System.out.println("address = "+address);
		System.out.println("phNum = "+phNum);
		System.out.println("course = "+course);
	}
	
	//dispaly balance
	public void displayBalance() {
		System.out.println("Total fee due is : "+balance);
	}

	public static void main(String[] args) {
		ObjectDemo obj1 = new ObjectDemo();
//		obj1.setDetails(101, "nivedita", "hudacolony", 9876543210l, "testing", 9000.00);

		obj1.displayDetails();
		System.out.println(obj1.name);
		obj1.payFee(9000);
//		System.out.println(obj1.balance);
		obj1.displayBalance();
		obj1.payFee(5000);
//		System.out.println(obj1.balance);
		obj1.displayBalance();
		
		ObjectDemo obj2 = new ObjectDemo();
		obj2.setDetails(102, "sunil", "miyapur", 9876567897l, "testing", 9000.00);
//		System.out.println(obj2.name);
//		System.out.println(obj2.address);
//		System.out.println(obj2.phNum);
		obj2.displayDetails();
		obj2.displayBalance();
		obj2.payFee(4000);
		obj2.displayBalance();
		
		ObjectDemo obj3 = new ObjectDemo();
		obj3.setDetails(103, "Ram", "lingampalli", 8765431208l, "selenium", 6000.00);
		
		obj3.displayDetails();
		obj3.updatePhoneNumber(9876123498l);
		obj3.displayDetails();
		
		obj2.displayDetails();
		obj1.displayDetails();
		
		obj1.balance = 4000;
		obj1.displayBalance();
		
	}

}
