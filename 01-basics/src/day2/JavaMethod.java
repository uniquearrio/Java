package day2;

public class JavaMethod {
	int num1 = 20;
	static int num2 =30;
	
	void instance_method() {
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		static_method();
	}

	static void static_method() {
		System.out.println("num2 = "+num2);
		
	}
	public static void main(String[] args) {
		JavaMethod obj = new JavaMethod();
		obj.instance_method();
		
		static_method();
	}
}

