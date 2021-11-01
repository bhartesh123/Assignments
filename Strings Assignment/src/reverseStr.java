import java.util.*;
import java.lang.*;

public class reverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the String to be reversed \n");
		String str=sc.nextLine();
		System.out.println("Entered String is : \n"+str);
		String[] strArray=str.split(" ");
		/*for(String temp:strArray) {
			System.out.println(temp);
			
		}*/
		
		for(int i=0;i<=strArray.length-1;i++) {
			char[] array=strArray[i].toCharArray();
			for(int j=array.length-1;j>=0;j--) {
				System.out.print(array[j]);
				
			}
			System.out.print(" ");
		}
		
		
	}

}

/* ------------Revese Alternate String-------
StringBuilder sb=new StringBuilder();

for(int i=0;i<strArray.length;i++) {
	if(i%2==0) {
		sb.append(strArray[i]);
	}
	else {
		sb.append(new StringBuilder(strArray[i]).reverse());
	}
	sb.append(" ");
	}
	System.out.print(sb.toString().trim());*/