package Assignments;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("How many number you want to type: ");
		int numcount = sc.nextInt();
		int i = 0;
		var even = 0;
		var odd= 0;
		var zero = 0;
		while(i<numcount) {
			System.out.println("Enter any number: ");
			int num = sc.nextInt();
			
			if(num>0) {
				even=even+1;
			}else if(num<0){
				odd=odd+1;
			}else {
				zero=zero+1;
			}
			i++;
		}
		
		System.out.println("Number of even:" + even);
		System.out.println("Number of odd:" + odd);
		System.out.println("Number of zero:" + zero);
		sc.close();
	}
}
