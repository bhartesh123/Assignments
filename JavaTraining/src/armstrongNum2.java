
public class armstrongNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100,arm;
		System.out.println("Armstrong Number from 100-999\n");
		while(i<1000) {
			arm=armstrong(i);
			if(arm==i) {
				//System.out.print("--------------------------------");
				System.out.print("\n"+i+" Is ArmStroong Number of  "+arm);
				//System.out.print("\n--------------------------------\n");
			}
			i++;
		}
	}
	static int armstrong(int n) {
		int r,sum=0,temp=n;
		while(n>0) {
			r=n%10;
			sum+=(r*r*r);
			n=n/10;
		}
		//System.out.println(sum+" is sum on "+temp);
		return sum;
		
			
	}
	

}
