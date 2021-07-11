class Account{
	private int accountNo;
	private double accountBalance;
	private String accountPassword;
	
	private static String bankName;
	
	static void setBankName(String name) {
		System.out.println("Setting bankName......");
		bankName = name;
	}
	
	public Account(int accountNo,double accountBalance, String accountPassword){
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}
	
	void displayAccount() {
		System.out.println("Account Number: " + accountNo);
		System.out.println("Account Balance:" + accountBalance);
	}
	
	void updateBalance(double newBalance) {
		System.out.println("Updating Balance......");
		accountBalance = newBalance;
	}
}
public class BankAccount2 {
	public static void main(String[] args) {
		Account.setBankName("ICICI"); //shared data member
		Account a1 = new Account(123,1000,"kartik");
		a1.displayAccount();
		a1.updateBalance(2000);
		a1.displayAccount();
	}
}
