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

		//rajesh    raja 
		BankAccount bankAccObj4 = bankAccObj1; //this is done by main method
		
		System.out.println("-------4th obj created---------");
	
		System.out.println("bankAccObj1 : "+bankAccObj1);
		System.out.println("bankAccObj2 : "+bankAccObj2);
		System.out.println("bankAccObj3 : "+bankAccObj3);
		System.out.println("bankAccObj4 : "+bankAccObj4);
			
		
		bankAccObj4.showBankAccount();
		
		bankAccObj4.withdraw(7000);
		
		bankAccObj1.showBankAccount();
		bankAccObj4.showBankAccount();
		
		bankAccObj1.deposit(20000);

		bankAccObj1.showBankAccount();
		bankAccObj4.showBankAccount();

		
		Cashier cashierObj = new Cashier();
		cashierObj.dispenseCash(bankAccObj1, 3000);
		
		bankAccObj1.showBankAccount();
		System.out.println("============");
		
		cashierObj.transferFunds(bankAccObj1, bankAccObj2, 23000);
		
		bankAccObj1.showBankAccount();
		bankAccObj2.showBankAccount();

	}
}

class Person
{
	
}

class CashFlow
{
	
}

//Developer -> Tester = Deployment -> Production
class Cashier extends Person //isA
{
	
	CashFlow cashFlow = new CashFlow(); //hasA
	
						//usesA
	void dispenseCash(BankAccount x, double y) {
		System.out.println("the cashier is dispensing cash for "+x+ " how much cash ? "+y);
		x.withdraw(y);
		//x.withdraw(y);
		//x.withdraw(y);
		
		//x.accountBalance=x.accountBalance-y;
		//x.accountHolderName="jacky";
		//x.accountNumber=420;
	}
	void transferFunds(BankAccount  ref1, BankAccount ref2, double amountToTransfer)
	{
		System.out.println("Transferring funds from "+ref1+ " to "+ref2);
		ref1.withdraw(amountToTransfer);
		ref2.deposit(amountToTransfer);
	}
}

// https://github.com/vishhaldawane/KPITOCT2023
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
