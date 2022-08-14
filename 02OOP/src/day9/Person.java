package day9;

public class Person {
	String name;
	int age;
	boolean single;
	
	//parameterized constructor
	public Person(String name,int age, boolean status) {
		this.name=name;
		this.age = age;
		this.single = status;
		
	}
	
	public void display() {
		System.out.println("Name :" + name);
		System.out.println("Age: " + age);
		System.out.println("Is single: " + ((single) ?"yes" : "no"));
	}
}
