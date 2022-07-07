package Practising_Testing;

public class Arrays_Test {
	public static void main(String[] args) {
		int[] numbers = {1,25,30,45,50,6};
		
//		int index = 0;
//		while(index<=5) {
//			System.out.println(numbers[index]);
//			index++;
//		}
		for(int index = 0;index<=5;index++) {
			System.out.println(numbers[index]);
		}
		
		for (int element : numbers) {
			System.out.println(element);
		}
	}
}
