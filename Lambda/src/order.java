
public class order {
	private int id;
	private String name;
	public int price;
	private String status;
	public order(int id, String name, int price,String status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.status=status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "ID : "+this.id+" Name : "+this.name+" Price : "+this.price+" Status : "+status;
	}
}
