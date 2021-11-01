import java.util.*;
public class removeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter the Steing : ");
		name=sc.nextLine();
		System.out.println("Enter the char to remove ; ");
		String t=sc.nextLine();
		char c=t.charAt(0);
		int n=name.length();
		int j,count=0;
		char[] a=name.toCharArray();
		
		for(int i=j=0;i<n;i++) {
			if(a[i]!=c) {
				a[j++]=a[i];
				
			}
			else {
				count++;
			}
		}
		while(count>0) {
			a[j++]='\0';
			count--;
		}
		System.out.println(a);
		
	}

}
