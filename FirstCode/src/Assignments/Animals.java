package Assignments;
public class Animals implements Carnivorous,Omnivorous,Herbivorous {	

	@Override
	public void HerbivorousAnimals() {		
		System.out.println("This is Herbivorous Interface group : Animals Under this group are :");
		System.out.println("Camel");
		System.out.println("Elephant");
		System.out.println("Sheep");
	}

	@Override
	public void OmnivourousAnimals() {
		System.out.println("This is Omnivorous Interface group : Animals Under this group are :");
		System.out.println("Dog");
		System.out.println("Crow");
		System.out.println("Fox");
	}

	@Override
	public void CarnivorousAnimal() {
		System.out.println("This is Carnivorous Interface group : Animals Under this group are :");
		System.out.println("Lion");
		System.out.println("Tiger");
		System.out.println("Crocodile");
	}

	public static void main(String[] args) {		
		Carnivorous carni=new Animals();
		Animals ani=new Animals();
		Omnivorous omi=new Animals();
		carni.CarnivorousAnimal();
		ani.HerbivorousAnimals();
		omi.OmnivourousAnimals();
	}
}