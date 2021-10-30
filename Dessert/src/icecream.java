
public class icecream extends dessertItem{
	private String name;
	private double price;
	public icecream(String name,double price) {
		this.name=name;
		this.price=price;
	}
	public double getcost() {
		//double cost=(double)Math.round(price*weight);
		return price;
	}
	public void add() {
		System.out.println("Ice-Cream is added Successfully \nName-"+name+"\nPrice-"+price);
		
	}
	
}
