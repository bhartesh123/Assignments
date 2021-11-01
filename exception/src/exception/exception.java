package exception;



public class exception {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		SavingAccount sv=new SavingAccount();
		try{
			sv.deposit(10000);
		
		System.out.println("Your Balance is "+sv.balance());
		sv.deposit(90008);
		System.out.println("Your Balance is "+sv.balance());
		
		sv.withdraw(120000);
		} catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}
		System.out.println("Your Balance is "+sv.balance());
		sv.deposit(-1009);
		
	}

}
