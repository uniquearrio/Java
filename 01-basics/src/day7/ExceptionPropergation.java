package day7;

public class ExceptionPropergation {
	public static void main(String[] args) {
		test3();
	}
	private static void test3(){
		test2();
	}
	private static void test2() {
		test1();
	}
	private static void test1() {
		System.out.println(100/2);
	}
}
