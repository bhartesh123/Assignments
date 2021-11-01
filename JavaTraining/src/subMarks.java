import java.util.*;
public class subMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float sub1,sub2,sub3;
		System.out.println("Enter First Subject Marks : ");
		sub1=sc.nextInt();
		System.out.println("Enter Second Subject Marks : ");
		sub2=sc.nextInt();
		System.out.println("Enter Third Subject Marks : ");
		sub3=sc.nextInt();
		
		if(sub1>60 && sub2>60 && sub3>60) {
			System.out.println("-----Passed-----");
		}
		else if((sub1>60 && sub2>60) || (sub2>60 && sub3>60) || (sub1>60 && sub3>60)) {
				System.out.println("-----Promoted----");
		}
		else {
			System.out.println("----Failed----");
		}
	}

}

