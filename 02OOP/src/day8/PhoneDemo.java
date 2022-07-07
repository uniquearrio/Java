package day8;

public class PhoneDemo {
	public static void main(String[] args) {
			Phone phone1 = new Phone("I phone", 15000000,"Purple");
			Phone phone2 = new Phone("Samsung", 15000000,"White");
			Phone phone3 = new Phone("Vivo", 15000000,"Grey");
			
			System.out.println("Phone 1 info = " + phone1.brand +" "+phone1.color +" "+phone1.price);
			phone1.call();
			phone1.sendSms();
			
			System.out.println("Phone 2 info = " + phone2.brand +" "+phone2.color +" "+phone3.price);
			phone2.call();
			phone2.sendSms();
			
			System.out.println("Phone 3 info = " + phone3.brand +" "+phone3.color +" "+phone3.price);
			phone3.call();
			phone3.sendSms();
			
			Phone.shop="axy";
			System.out.println(phone2.shop);
		}
}
