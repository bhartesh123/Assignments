package spring;

public class hello {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void say() {
		System.out.println("Hello "+this.name);
	}
}
