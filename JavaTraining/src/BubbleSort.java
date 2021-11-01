import java.util.Scanner;

public class BubbleSort {

	static void sort(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	//	return a[];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47,2};
		//int find=19;
		System.out.print("Array = ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		BubbleSort.sort(arr);
		System.out.println("\nAfter Bubble Sort : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
