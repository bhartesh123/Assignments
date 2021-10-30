package exception;



public class SavingAccount{
	private long id;
	private double balance;
	public double balance() {
        return balance;
    }
	public void withdraw(int amt)throws InsufficientBalanceException  {
		
				
			
			if(amt>balance) {
				System.out.println();
				throw new InsufficientBalanceException("Your Balance is "+balance+" and you are trying to withdrawl "+amt);
			}
			//balance-=amt;
		
		 balance-=amt;
			
	}
	  
	
	public void deposit(int amt) {
		  if (amt <= 0) {
	            throw new IllegalArgumentException(String.format("Invalid deposit amount %s", amt));
		  }
		 balance+=amt;
		  
	}
}