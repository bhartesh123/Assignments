
public class candy extends dessertItem {
	private String name;
	private double price,weight;
	public candy(String name,double price,double weight) {
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	public double getcost() {
		double cost=(double)Math.round(price*weight);
		return cost;
	}
	public double getWeight() {
		return weight;
	}
	public void add() {
		System.out.println("Candy is added Successfully \nName-"+name+"\nPrice-"+price+"\nWeight-"+weight);
	}
	
}
