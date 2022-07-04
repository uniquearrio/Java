package Assignments;

import java.util.Scanner;

import com.sun.tools.javac.Main;

public class Sleeptime {
	public static void main(String[] args) {
		//open
		Scanner sc= new Scanner(System.in);
		
		//Request information
		System.out.print("Enter sleep time: ");
		int sleep = sc.nextInt();
		sc.nextLine();
		System.out.print("AM or Pm : ");
		String s = sc.nextLine();
		
		System.out.print("Enter wakeup time: ");
		int wake = sc.nextInt();
		sc.nextLine();
		System.out.print("AM or PM : ");
		String w = sc.nextLine();
		

		
		//caculate
		if((s.equalsIgnoreCase("AM") && w.equalsIgnoreCase("AM")) || (s.equalsIgnoreCase("PM") && w.equalsIgnoreCase("PM"))) {
			int sleeptime = wake - sleep;
			System.out.println("sleep: "+ sleep);
			System.out.println("wake: "+wake);
			System.out.print("You sleep : " + sleeptime +"hours");
		}
		else if((s.equalsIgnoreCase("AM") && w.equalsIgnoreCase("PM")) || (s.equalsIgnoreCase("PM") && w.equalsIgnoreCase("AM"))) {
			int sleeptime = (12-sleep)+wake;
			System.out.println("sleep: "+ sleep);
			System.out.println("wake: "+wake);
			System.out.print("You sleep : " + sleeptime + "hours");
		}
		
		
		
		
	}
}
