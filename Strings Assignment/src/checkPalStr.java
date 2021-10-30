import java.util.*;
public class checkPalStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean res=true;
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				res=false;
				
			}
		}
		if(res) {
			System.out.println("The entered String "+str+" is Palindrome ");}
		else {
			System.out.println("The entered String "+str+" is not Palindrome ");
		}
	}

}
