package day4;

import java.util.Arrays;

public class ArrayTesting {
	public static void main(String[] args) {
		int[] arr1 = {100,500,200,200,300};
		
		//print
		for(var num : arr1)
			System.out.print(num +" ");
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
			System.out.println("\nAfter copyint,arr2: " + Arrays.toString(arr2));
			
		var arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println("After copying,arr3: " + Arrays.toString(arr3));
		
		System.out.println("arr1 == arr2 " + Arrays.equals(arr1, arr2));
		
		Arrays.sort(arr1);
		System.out.println("After sorting " + Arrays.toString(arr1));
		
		System.out.println("Is 200 in array: " + Arrays.binarySearch(arr1,200));
		System.out.println("Is 700 in array: " + Arrays.binarySearch(arr1,700));
		
		int total = Arrays.stream(arr1).sum();
		System.out.println("Total: " + total);
		int max = Arrays.stream(arr1).max().getAsInt();
		System.out.print("Max value: " + max);
		System.out.println("Min value: " + Arrays.stream(arr1).min().getAsInt());
		
		changeValue(arr1);
		System.out.println("After calling method,  arr1 : "+  Arrays.toString(arr1));
		
		Student s = new Student();
		s.rno = 20;
		System.out.println("before,rno: " + s.rno);
		changeRno(s);
		System.out.println("after, rno: " + s.rno);
		
		
	}

	private static void changeValue(int[] arr1) {
		data[0] = 1000;
		
	}
}
