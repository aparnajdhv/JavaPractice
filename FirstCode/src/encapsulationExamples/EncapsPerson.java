package encapsulationExamples;

public class EncapsPerson {
	
	private int age;
	private String name;
	private String country;
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setCountry(String country) {
		this.country=country;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void personDetails() {
		System.out.println("Person name is :"+name);
		System.out.println("Person Age is :"+age);
		System.out.println("Person Country is :"+country);
	}

}
