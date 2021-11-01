package genericClasses;

public class genericMethod {
	public static <T> void pass(T[] arr,int x,int y) {
		
		T t=arr[(int) x];
		arr[(int) x]=arr[(int) y];
		arr[(int) y]=t;
		for(T e:arr) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ar[]= {20,10,40};
		
		
		pass(ar,1,2);
		
	}

}
