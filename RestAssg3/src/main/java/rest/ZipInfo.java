package rest;

public class ZipInfo {
	private String city;
	private String state;
	private String town;
	private String zipcode;
	public ZipInfo(String city, String state, String town, String zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.town = town;
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "ZipInformation [city=" + city + ", state=" + state + ", town=" + town + ", zipcode=" + zipcode + "]";
	}
	
}
