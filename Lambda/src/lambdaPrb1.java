
public class lambdaPrb1 {
	interface arthmaticOpt{
		public void opt(int a,int b) ;
			
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arthmaticOpt add= (int a,int b) -> {
			System.out.println("Addition is "+a+b);
		};
		add.opt(10,20);
		arthmaticOpt multiply= (int a,int b) -> {
			System.out.println("Multiply is : "+a*b);
		};
		multiply.opt(10,20);
		arthmaticOpt divide= (int a,int b) -> {
			System.out.println("Division is :"+a/b);
		};
		divide.opt(100,20);
		arthmaticOpt sub= (int a,int b) -> {
			System.out.println("Substraction is :"+(a-b));
		};
		sub.opt(10,20);
	}

}
