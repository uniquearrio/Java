package day8;

public class Phone {
	//field
	
	String brand;
	String color;
	int price;
	
	static String shop;
	//constructor
	public Phone(String brand,int price,String color) {
		this.brand = brand;
		this.price =price;
		this.color = color;
	}
	
	//methods
	public void call() {
		System.out.println("Phone calling can be made at here");
		
	}
	public void sendSms() {
		System.out.println("Message can be sent at here");
	}
	
	
}
