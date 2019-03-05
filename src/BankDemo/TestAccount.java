package BankDemo;

public class TestAccount {
	
	public static void main(String[] args) {
		Account a1 = new CurrentAccount("mythra", "lingampalli", 9877665544l, 30000.00, "pan1");
		a1.deposite(5000);
		System.out.println(a1);
		System.out.println("balance is "+a1.getBalance());
		double amount = a1.withdraw(12000);
		System.out.println("balance is "+a1.getBalance());
		amount = a1.withdraw(4000);
		System.out.println("balance is "+a1.getBalance());
	}

}
