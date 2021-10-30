import java.util.*;
public class FindArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		//int find=19;
		System.out.print("Array = ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter the element to search : ");
		int elm=sc.nextInt();
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			if(elm==arr[i]) {
				 temp=elm;
			}
		}
		if(temp == elm) {
			System.out.println(elm+" is found in array");
		}
		else {
			System.out.println(elm+" is not found in the Array");
		}
	}

}
