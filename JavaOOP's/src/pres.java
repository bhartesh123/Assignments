abstract class persistance
{
	int persistance_obj=20;
	persistance(){
		System.out.println("Persistance Object");
	}
	abstract void persist() ;
		// TODO Auto-generated method stub
		
	

}
class FilePersistance extends persistance{
	void persist() {
		//System.out.println("Persistance Object");
		System.out.println(" "+super.persistance_obj);//.persistance_obj
	}
}
class Datapersistance extends persistance{
	void persist() {
		
	}
}
public class pres {
	public static void main(String []args) {
		persistance persistance = new FilePersistance();
		persistance.persist();
		
	}
}
