package day5;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalTime_Test {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		LocalTime time1 = LocalTime.of(4, 30, 29);
		LocalTime time2 = LocalTime.parse("04:50");
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(now);
		
		LocalDateTime obj1 = LocalDateTime.now();
		LocalDateTime obj2 = LocalDateTime.of(2022, Month.MARCH, 16, 20, 01);
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
}
