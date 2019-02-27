package encapuslation;

import java.util.Scanner;
/*
 * Encapsulation means hiding data from the outside world
 * we can hide the properties by declaring them using private access modifier
 * we have to create public getter and setter methods for the required fields
 * 
 */

public class EncapsulationDemo {

	private String accNum;
	private String accHolderName;
	private String address;
	private long phNum;
	private double balance;
	private String password;

	public EncapsulationDemo(String accNum, String accHolderName, String address, long phNum, double balance) {
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.address = address;
		this.phNum = phNum;
		this.balance = balance;
		this.password = "selenium";
	}

	// getter for accnum
	public String getAccNum() {
		return this.accNum;
	}

	// getter for accholder name
	public String getAccHolderName() {
		return this.accHolderName;
	}

	// getter for address
	public String getAddress() {
		return this.address;
	}

	// setter for address
	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhNum() {
		return this.phNum;
	}

	public void setPhNum(long phNum) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your password");
		String password = s.next();
		if (password.equals(this.password)) {
			this.phNum = phNum;
			System.out.println("phone number successuflly modified");
		}else {
			System.out.println("invalid password");
		}
	}

	public double getBalance() {
		return this.balance;
	}

}
