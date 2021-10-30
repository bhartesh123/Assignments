import java.util.*;
public class SimpleCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double principal,rate,time;
		System.out.println("Enter the principle to find Simple and Compound Interesrt\n");
		principal= sc.nextDouble();
		System.out.println("Enter the Rate to find Simple and Compound Interesrt");
		rate=sc.nextDouble();
		System.out.println("Enter the Time to find Simple and Compound Interesrt");
		time=sc.nextDouble();
		System.out.println("--------------------------------");
		System.out.println("Simple Interest is \n");
		double SI = (principal * time * rate)/100;
		System.out.println("Simple Interest = "+SI);
		System.out.println("--------------------------------");
		System.out.println("Compound Interest is \n");
		System.out.print("\nEnter number of times interest is compounded: ");
	    int number = sc.nextInt();
	    double CI=principal*(Math.pow((1+rate/100), (number*time)))-principal;
	    System.out.println("Compound Interest = "+CI);
	}

}
