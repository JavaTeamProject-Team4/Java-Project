package chap07.upcasting;

class Animal {
	String name;
	
	void nature() {
		System.out.println("Animal nature() called");
	}
}

class Fish extends Animal {
	String color;
	
	@Override
	void nature() {
		System.out.println("Fish nature() called");
	}
}

class Human extends Animal {
	@Override
	void nature() {
		System.out.println("Human nature() called");
	}
}