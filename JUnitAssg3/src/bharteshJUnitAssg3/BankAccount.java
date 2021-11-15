package bharteshJUnitAssg3;

public class BankAccount {
	Long AccNo=180021880006333L;
	static double balance=20000;
	
	public void withdraw(double amount) throws InsufficientFundException{
		if(amount>balance) {
			throw new InsufficientFundException();
		}
		else {
			balance-=amount;
			System.out.println("Your Bank Account "+AccNo+" Debited with amount "+amount+" and available balance is "+balance);
		}
	}
	
}
