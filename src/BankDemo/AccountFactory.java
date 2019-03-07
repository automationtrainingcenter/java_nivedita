package BankDemo;

public class AccountFactory {

	public static IAccount createAccount(AccountType accountType, String accHolderName, String address, long phNum,
			double balance, String panNum) {
		IAccount account = null;

		switch (accountType) {
		case CURRENT:
			account = new CurrentAccount(accHolderName, address, phNum, balance, panNum);
			break;
		case SAVINGS:
			account = new SavingsAccount(accHolderName, address, phNum, balance, panNum);
			break;
		}
		return account;
	}

}
