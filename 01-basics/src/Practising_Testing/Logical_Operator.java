package Practising_Testing;

import java.util.Scanner;

public class Logical_Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Subject 1 mark: ");
		int sub1 = sc.nextInt();
		System.out.println("Enter Subject 2 mark: ");
		int sub2 = sc.nextInt();
		
		if(sub1 >= 40 && sub2 >= 40) {
			System.out.println("You are Pass");
		}else {
			System.out.println("YOu are Fail");
		}
	}
}
