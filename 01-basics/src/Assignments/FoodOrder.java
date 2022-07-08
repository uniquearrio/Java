package Assignments;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class FoodOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] township = {"AA","BB","CC","DD"};
		int[] times= {15,30,10,45};
		String[] menus = {"Pizza","Burger","Milk Tea","Spicy Noodle"};
		String[] OrderType = {"Order Now?","Preorder?"};
		
//	Menu & Food choose
		System.out.println("****This is Menu of our shop****");
		for(int i=0;i<menus.length;i++) {
			System.out.println((i+1) + ". " +menus[i]);
		}
		System.out.println("Type the number of food you want: ");
		int NumberOfFood = sc.nextInt();
		String ChosenFood = "";
		for(int i=0;i<menus.length;i++) {
			if(NumberOfFood == i+1) {
				ChosenFood = menus[i];
				break;
			}
		}
//	Township & time
		System.out.println("****Our deliery is avalible in these township****");
		for(int i=0;i<township.length;i++) {
			System.out.println((i+1)+". "+township[i]+"("+times[i]+")"+"minus");
		}
		System.out.println("Type the number of township you want: ");
		int NumberOfTownship = sc.nextInt();
		String ChosenTown="";
		int time = 0;
		for(int i=0;i<township.length;i++) {
			if(NumberOfTownship == i+1) {
				ChosenTown = township[i];
				time = times[i];
				break;
			}
		}
//	Order type
		System.out.println("**** Type of order ****");
		for(int i=0;i<OrderType.length;i++) {
			System.out.println((i+1)+". "+OrderType[i]);
		}
		System.out.println("Choose Order Type: ");
		int ChosenType = sc.nextInt();
		LocalTime now = LocalTime.now();
		var Arrivaltime = now.plusMinutes(time);
		SimpleDateFormat formatDate = new SimpleDateFormat("hh:mm a");
		if(ChosenType==1) {
			System.out.println("***Your Order Information***");
			System.out.println("Item Name: " + ChosenFood);
			System.out.println("Your Address: " + ChosenTown);
			System.out.println("Duration: " + time);
			System.out.println("Arrival Time: " + Arrivaltime);
			System.out.println("**********Thank You For Ordering*******");
			
		}else if(ChosenType==2) {
			System.out.println("How many days do you want?");
			int day = sc.nextInt();
			LocalDate dd = LocalDate.now();
			var ArrivalDate = dd.plusDays(day);
			System.out.println("Item Name: " + ChosenFood);
			System.out.println("Your Address: " + ChosenTown);
			System.out.println("Arrival Time: " + ArrivalDate);
			System.out.println("**********Thank You For Ordering*******");
			
		}else {
			System.out.println("You can't choose this nuber!");
		}
		
	}
}
