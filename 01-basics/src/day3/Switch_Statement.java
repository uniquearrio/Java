package day3;

import java.util.Scanner;

public class Switch_Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter food name: ");
		String name = sc.nextLine();
		String category = null;
		switch (name){
			case "burger", "pizza","sandwitch":
				category ="fastfood";
				break;
			case "yogurt" , "milktea":
				category = "Dessert";
				break;
			case "sushi":
				category = "Jp food";
				break;
			default:
				category = "unknown";
		}
		System.out.println(name + "is" + category);
		sc.close();
	}
}
