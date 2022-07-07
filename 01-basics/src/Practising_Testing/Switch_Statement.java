package Practising_Testing;

import java.util.Scanner;

public class Switch_Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Score: ");
		int score = sc.nextInt();
		
		switch(score){
			case 100:
				System.out.println("Good JOb");
				sc.nextLine();
				System.out.println("Enter Language: ");
				var whichLanguage = sc.nextLine();
				switch(whichLanguage) {
					case "ENGLISH":
					System.out.println("Oh,You are good at English");
					System.out.println("Choose Uni you want: ");
					var uni = sc.nextLine();
					System.out.println("congract now you are a student of: "+ uni);
					
				}
				break;
			case 90:
				System.out.println("Nice");
				break;
			case 50:
				System.out.println("Not bad");
				break;
			case 40:
				System.out.println("Lucky:)");
				break;
			case 30:
				System.out.println("Stupid mf");
				break;
				
		}
		

	}
}
