import java.util.*;
class animal{
	void anmm()
	{
		System.out.println("This is Animal");
	}
}
class dogs extends animal{
	void bark() {
		System.out.println("Baauu Baauu");
	}
}
class ang extends dogs{
	void barks() {
		System.out.println("Abc");
	}
}
public class collectionPrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dogs o=new dogs();
		o.anmm();
		o.bark();
		
	}
	

}
