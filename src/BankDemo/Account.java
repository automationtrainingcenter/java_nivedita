package BankDemo;

public class Account implements IAccount{

	private int accNum = 234123;
	private static int i = 0;
	private String accHolderName;
	private String address;
	private long phNum;
	protected double balance;
	private String panNum;

	private Account() {
		this.accNum = this.accNum + i;
		i++;
	}

	public Account(String accHolderName, String address, long phNum, double balance, String panNum) {
		this();
		this.accHolderName = accHolderName;
		this.address = address;
		this.phNum = phNum;
		this.balance = balance;
		this.panNum = panNum;
	}

	@Override
	public String toString() {
		return "\naccount number : " + this.accNum + "\naccount holder name : " + this.accHolderName + "\naddress : "
				+ this.address;
	}

	public long getPhNum() {
		return phNum;
	}

	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}

	public double getBalance() {
		return balance;
	}

//	protected void setBalance(double balance) {
//		this.balance = balance;
//	}

	public String getPanNum() {
		return panNum;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("deposite succesfull");
		}else {
			System.out.println("invalid amount.. please check the amount you entered");
		}
	}
	
	public double withdraw(double amount) {
		if(amount > 0) {
			if(this.balance >= amount) {
				this.balance -= amount;
				System.out.println("withdraw successfull");
				return amount;
			}else {
				System.out.println("insufficient balance in account");
				return 0;
			}
		}else {
			System.out.println("invalid amount.. please check the amount you entered");
			return 0;
		}
	}
}
