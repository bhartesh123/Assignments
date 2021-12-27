package SpringExample;

import java.util.List;

public class HelloWorld {
//	private List<Triangle> list;
	
	  private Triangle trgA; private Triangle trgB; private Triangle trgC;
	 
	
	/*
	 * public HelloWorld(String name, int height) { //super(); this.name = name;
	 * this.height = height; }
	 * 
	 * public HelloWorld(String name) { //super(); this.name = name; }
	 * 
	 * public HelloWorld(int height) { super(); this.height = height; }
	 */

	/*
	 * public List<Triangle> getList() { return list; }
	 * 
	 * 
	 * public void setList(List<Triangle> list) { this.list = list; }
	 */
	/*
	 * public List<Triangle> getList() { return list; }
	 * 
	 * public void setList(List<Triangle> list) { this.list = list; }
	 */
	
	
	  public Triangle getTrgA() { return trgA; }
	  
	  public void setTrgA(Triangle trgA) { this.trgA = trgA; }
	  
	  public Triangle getTrgB() { return trgB; }
	  
	  public void setTrgB(Triangle trgB) { this.trgB = trgB; }
	  
	  public Triangle getTrgC() { return trgC; }
	  
	  public void setTrgC(Triangle trgC) { this.trgC = trgC; }
	 
	/*
	 * public String getName() { return name; }
	 * 
	 * 
	 * 
	 * public void setName(String name) { this.name = name; }
	 */
	public void say() {
		//System.out.println("Hii "+name+" is "+height);
		
		/*
		 * for(Triangle t:list) {
		 * System.out.println("Triangle is X = "+t.getX()+" Triangle is Y = "+t.getY());
		 * }
		 */
		 
		
		  System.out.println("PointA =("+getTrgA().getX()+","+getTrgA().getY()+")");
		  System.out.println("PointB =("+getTrgB().getX()+","+getTrgB().getY()+")");
		  System.out.println("PointC =("+getTrgC().getX()+","+getTrgC().getY()+")");
		 
	}

	
}
