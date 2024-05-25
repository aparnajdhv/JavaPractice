package encapsulationExamples;

public class EncapsMainPerson {

	public static void main(String[] args) {
		
		EncapsPerson p1=new EncapsPerson();
		
		p1.setAge(25);
		p1.setName("Asha");
		p1.setCountry("India");
		
//		p1.getAge();
//		p1.getName();
//		p1.getCountry();
		
		p1.personDetails();

	}

}
