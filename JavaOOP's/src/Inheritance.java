
public class Inheritance {
	public static void main(String []args) {
		int total=0;
		currentAcc ca=new currentAcc();
		savingAcc sa=new savingAcc();
		total+=ca.deposit(20000);
		ca.abc(100);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Total Amount in the Bank is : "+total);
	}
}
