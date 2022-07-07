package Assignments;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Arrays;
import java.util.List;

public class DateTime_part1 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		String [] WeekFields = new String[] {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
		
		var day = now.getDayOfWeek();//week day
		System.out.println(day);
		
		//boolean result = Arrays.stream(WeekFields).anyMatch(day :: equals);
		String tmp = String.valueOf(day);//**********
		
		List<String> list = Arrays.asList(WeekFields);
		if (list.contains(tmp)) {
			System.out.println("today is weekday.I have no time.I am studying programming Language");
		}else {
			System.out.println("today is weekend.");
		}
	}
}
