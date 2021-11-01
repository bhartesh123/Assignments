
public class SingleTon {
	private static SingleTon instance;
	private SingleTon() {
		System.out.println("This is SingleTon Class;");
		
	}
	public static SingleTon getInstance() {
		instance=new SingleTon();
		return instance;
	}
}
class Main{
	public static void main(String []args) {
		SingleTon a=SingleTon.getInstance();
	}
}