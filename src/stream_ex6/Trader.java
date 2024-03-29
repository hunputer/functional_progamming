package stream_ex6;

public class Trader {
	private String name;
	private String city;
	
	public Trader(String n, String c) {
		this.name = n;
		this.city = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader : " + name + " in " + city;
	}
	
	
}
