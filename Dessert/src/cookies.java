
public class cookies extends dessertItem{
	private String name;
	private double price;
	public cookies(String name,double price) {
		this.name=name;
		this.price=price;
		
	}
	public double getcost() {
		//double cost=(double)Math.round(price*weight);
		return price;
	}
	public void add() {
		System.out.println("Cookies is added Successfully \nName-"+name+"\nPrice-"+price);
	}
}
