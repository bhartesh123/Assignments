class shape{
	//void abc() {System.out.println(" This is Shape Class");}
 static void daw(){System.out.println(" This is Shape Class");}
//	void abc() {System.out.println(" This is Shape Class");}
	
}
class rectangle extends shape{
	public rectangle() {
		System.out.println("This shape is Rectangle");
	}
}
class line extends shape{
	public line() {
		System.out.println("This shape is Line");
	}
}
class square extends shape{
	public void draw() {
		System.out.println("This shape is Square");
	}
}
public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape.daw();
		
	}

}
