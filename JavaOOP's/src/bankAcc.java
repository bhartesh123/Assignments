
abstract class bankAcc {
	public double balance=0;
	double abc(double amt){
		//double total=0;
		balance+=amt;
		System.out.println("Total Amount in the Bank Account is : "+balance);
		return balance;
	}
	abstract  double deposit(double amt);
}
class currentAcc extends bankAcc{
	private static double balance=0;
	double deposit(double amt){
			//double total=0;
			balance+=amt;
			System.out.println("Total Amount in the Current Account is : "+balance);
			return balance;
		}
}
class savingAcc extends bankAcc{
	private static double balance=0;
	double deposit(double amt){
		//double total=0;
		balance+=amt;
		System.out.println("Total Amount in the Saving Account  is : "+balance);
		return balance;
	}
}