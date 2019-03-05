package BankDemo;

public class CurrentAccount extends Account{
	private final double MIN_BALANCE = 25000.00;

	public CurrentAccount(String accHolderName, String address, long phNum, double balance, String panNum) {
		super(accHolderName, address, phNum, balance, panNum);
	}
	
	public double withdraw(double amount) {
		if(amount > 0) {
			if(this.balance >= amount) {
				this.balance -= amount;
				System.out.println("withdraw successfull");
				if(this.balance < MIN_BALANCE) {
					this.balance -= 75;
				}
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
