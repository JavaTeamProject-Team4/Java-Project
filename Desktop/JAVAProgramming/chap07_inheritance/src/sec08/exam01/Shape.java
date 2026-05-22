package sec08.exam01;

class Shape {
	public Shape() {}
	
	public void draw() {
		System.out.println("Shape draw");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line draw");
	}
}

class Rect extends Shape {
	public void draw( ) {
		System.out.println("Rect draw");
	}
}


class Circle extends Shape {
	public void draw() {
		System.out.println("Circle draw");
	}
}

