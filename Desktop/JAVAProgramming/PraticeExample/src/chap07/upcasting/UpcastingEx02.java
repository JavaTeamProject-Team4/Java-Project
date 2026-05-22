package chap07.upcasting;

public class UpcastingEx02 {
	public static void printObject(Animal objs[]) {
		for(Animal a : objs) {
			System.out.print(a.name + " -> ");
			a.nature();
		}
	}

	public static void main(String[] objs[]) {
		Animal animal = new Animal();
		animal.name = "BlueFish";
		
		Animal fish = new Fish();
		fish.name = "Whale";
		
		Animal person = new Human();
		person.name = "Person1";
		
		Animal animals[] = {animal, fish, person};
		printObject(animals);
	}

}