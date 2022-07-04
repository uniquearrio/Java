package day3;

import java.util.Scanner;

public class switch_expression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter food name: ");
		String name = sc.nextLine();
		
		String category =
				switch(name){
				case "burger", "pizza", "Sandwitch"->"Fast Food";
				case "monthingar"->"mmfood";
				case "sushi"->"jpfood";
				default -> "unknown";
		};
		
//		var category = 
//				switch(name) {
//				case "burger", "pizza", "Sandwitch"-> {
//					if(name.equals("pizza"))
//						System.out.println(name + "is" + "itlian food");
//						yield "fast food";
//				}
//				case "milk tea", "yogurt" -> {
//					yield"dessert";
//				}
//				default ->"unknown";
//				};
		System.out.println(name + "is" + category);
	}
}
