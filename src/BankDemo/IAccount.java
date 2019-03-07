package BankDemo;

public interface IAccount {

	public long getPhNum();

	public void setPhNum(long phNum);

	public double getBalance();

	public String getPanNum();

	public void setAddress(String address);
	
	public void deposite(double amount);
	
	public double withdraw(double amount);

}
