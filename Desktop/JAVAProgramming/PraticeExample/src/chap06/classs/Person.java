package chap06.classs;

public class Person {
	String name;
	int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.printf("Name : %s, Age : %s\n", name, age);
	}
}
