package chap07.inheritance;

public class Parent {
	// 필드 
	String name;
	String id;
	
	// 메소드 
	public void method1() {
		System.out.println("Parent-method1()");
	}
	// 메소드 
	public void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent {
	String job;
	int age;
	
	public Child(String job, int age) {
		this.job = job;
		this.age = age;
	}
	
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
}
