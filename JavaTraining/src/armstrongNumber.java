import java.util.Scanner;
public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,a,sum=0;
		System.out.print("Enter the number to find it is Armstrong Number or No\n");
		n=sc.nextInt();
		int temp=n;
		while(n>0) {
			a=n%10;
			sum+=(a*a*a);
			n=n/10;
		}
		if(temp==sum) {
			System.out.print(temp+" is an Armstrong Number because it's total sum of cude of digit is "+sum);
		}
		else {
			System.out.println(temp+" is not an Armstrong Number it's total sum of cude of digit is "+sum);
		}
		//System.out.println("Sum = "+sum);
	}

}
