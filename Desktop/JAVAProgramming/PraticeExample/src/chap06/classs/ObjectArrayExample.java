package chap06.classs;

public class ObjectArrayExample {

	public static void main(String[] args) {
		Person[] p = new Person[3];
		
		p[0] = new Person("Alice", 25);
		p[1] = new Person("Bob", 30);
		p[2] = new Person("Charlie", 28);
		
		System.out.println("=== Person Object Array ===");
		for (int i = 0; i < p.length; i++) {
			p[i].printInfo();
		}

	}

}
