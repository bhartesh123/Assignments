import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;
public class lambdaPrb2 {
interface ord{
	public void sort(int p);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<order> list=new ArrayList<order>();
		list.add(new order(10,"KitKat",30000,"Accepted"));
		list.add(new order(11,"Quadbry",3000,"Processing"));	
		list.add(new order(12," Gulab Jammun",1000,"Accepted"));
		list.add(new order(13,"Bourbon",30000,"Completed"));
		list.add(new order(13,"Vanilla",30000,"Completed"));
		list.add(new order(13,"Chokobar",100000,"Processing"));
		list.add(new order(13,"Cone",30000,"Accepted"));
		list.add(new order(13,"Bourbon",30000,"Processing"));
		list.add(new order(13,"Bourbon",30000,"Processing"));
		list.add(new order(13,"Bourbon",30000,"Processing"));
		
		//list.forEach(n -> System.out.println(n));
		System.out.println("Displaying the products of Price Greater than 10000 ");
		list.stream()
		.forEach(p->{if(p.getPrice()>10000)System.out.println("Name : "+p.getName()+"\t Price :"+p.getPrice());});
		//System.out.println("Using Lambda ");
		//ord o= p->{if(p.getPrice()>10000)System.out.println(p.getName());};
		System.out.println("Displaying the products of Status 'Accepted' or 'Completed' ");
		list.stream().forEach(p->{if(p.getStatus()=="Accepted" || p.getStatus()=="Completed")System.out.println("Name : "+p.getName()+"\t Price :"+p.getStatus());});
		System.out.println("Displaying the products of Price Greater than 10000 using filter");
		list.stream().filter(p->p.getPrice()>10000)
		.forEach(p->System.out.println("Name : "+p.getName()+"\t Price :"+p.getPrice()));
	}
	

}
	