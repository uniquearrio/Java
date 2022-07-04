package day5;

import java.time.LocalDate;

public class LocalDate_Test {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2022, 10, 01);
		LocalDate date3 = LocalDate.parse("1997-09-01");
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		LocalDate tomorrow = date1.plusDays(1);
		System.out.println(tomorrow);
		System.out.println(date1.minusDays(1));
		
		System.out.println(date1.getYear());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getMonth());
		System.out.println(date1.getDayOfWeek());
		System.out.println(date1.getDayOfMonth());
		
		System.out.println(date1.isLeapYear());
		System.out.println(date1.minusYears(6).isLeapYear());
	}
	
}
