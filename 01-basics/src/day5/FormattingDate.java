package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDate {
	public static void main(String[] args) {
		
		DateTimeFormatter format1 = DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter format2 = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter format3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		
		String output = date.format(format1);
		System.out.println(output);
		System.out.println(format2.format(time));
		System.out.println(datetime.format(format3));
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh-m-ss");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' h:m:s");
		
		System.out.println("Using custom pattern  " );
		System.out.println("Current Date: " + date.format(f1));
		System.out.println("Current time: " + time.format(f2));
		System.out.println("Current datetime: " + datetime.format(f3));
		
		DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter f5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter f6 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		System.out.println( "Current date using localized style" + date.format(f4));
		System.out.println("Current date using " +datetime.format(f5));
		System.out.println("Current date using " +datetime.format(f6));
	}
}
