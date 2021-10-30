import java.util.*;
public class incomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float tax=0,amt;
		System.out.println("Enter the amount to find tax");
		amt=sc.nextFloat();
		if(amt>=0 && amt<=180000) {
			tax=0;
			//System.out.println(tax);
		}
		else if(amt>180000 && amt<=300000) {
			tax=(amt/100)*10;
		}
		else if(amt>300000 && amt<=500000) {
			tax=(amt/100)*20;
		}
		else if(amt>500000 && amt<=1000000) {
			tax=(amt/100)*30;
		}
		System.out.println("Tax Payable amount is : "+tax);
	}

}
