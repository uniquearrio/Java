package Practising_Testing;

public class Method_Test {
	public static void main(String[] args) {
		hello();
		int Answer = caculate(1,2,3);
		System.out.println(String.valueOf(Answer));
		System.out.println((Answer));
	}
	public static void hello() {
		System.out.println("HEllo Java");
	}
	public static int caculate(int a,int b,int c) {
		return (a+b+c);
		
	}
}
