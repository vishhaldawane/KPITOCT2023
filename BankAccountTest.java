public class BankAccountTest {
	public static void main(String[] args) {
		System.out.println("hello");
		BankAccount bankAccObj1 = new BankAccount(101,"Jack",25000.0f);
		BankAccount bankAccObj2 = new BankAccount(102,"Jane",27000.0f);
		BankAccount bankAccObj3 = new BankAccount(103,"Jill",29000.0f);
		
		System.out.println("bankAccObj1 : "+bankAccObj1);
		System.out.println("bankAccObj2 : "+bankAccObj2);
		System.out.println("bankAccObj3 : "+bankAccObj3);
		
		bankAccObj1.showBankAccount(); // BankAccount::showBankAccount(bankAccObj1);
		bankAccObj2.showBankAccount();
		bankAccObj3.showBankAccount();

		
		bankAccObj1.deposit(25000); 
		bankAccObj2.deposit(27000);
		bankAccObj3.deposit(29000);
		
		bankAccObj1.showBankAccount();
		bankAccObj2.showBankAccount();
		bankAccObj3.showBankAccount();
		
		bankAccObj1.withdraw(3000);
		bankAccObj2.withdraw(9000);
		bankAccObj3.withdraw(12000);

		bankAccObj1.showBankAccount();
		bankAccObj2.showBankAccount();
		bankAccObj3.showBankAccount();

		
	}
}
class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	public BankAccount(int accountNumber, String accountHolderName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	void showBankAccount() {
		System.out.println("ACCOUNT NUMBER  : "+accountNumber);
		System.out.println("ACCOUNT HOLDER  : "+accountHolderName);
		System.out.println("ACCOUNT BALANCE : "+accountBalance);
		System.out.println("---------------------");
	}	
	void withdraw(double amountToWithdraw) {
		System.out.println(accountHolderName+" is withdrawing..."+amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
	}
	void deposit(double amountToDeposit) {
		System.out.println(accountHolderName+ " is depositing..."+amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
	}
}
