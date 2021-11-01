package genericClasses;

import java.util.*;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee a=new Employee();
		Employee e=new Employee(234,"Bhartesh","CSE",22000L);
		Employee e2=new Employee(235,"Prajwal","CSE",32000L);
		HashSet<Employee> hash=new HashSet<Employee>();

		hash.add(e);
		hash.add(e2);
	
		/*a.setHash(hash);
		hash.add(b);
		b.setHash(hash);
		hash.add(c);
		c.setHash(hash);
		hash.add(d);
		d.setHash(hash);*/

		for(Employee e1:hash) {
			System.out.println(e1.id+" "+e1.name+" "+e1.department+" "+e1.salary);
		}
		
		
	}

}
