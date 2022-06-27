package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readdata_bufferedreader {
	public static void main(String[] args) throws IOException {
		//create obj
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//operations
		System.out.print("enter name: ");
		String name = reader.readLine();
		System.out.print("Enter sfalary: ");
		int salary = Integer.parseInt(reader.readLine());
		System.out.print("Enter bonus rate: ");
		float bonus = Float.parseFloat(reader.readLine());
		
		//close
		reader.close();
		
		System.out.println("\n-------- Your data -----");
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
		System.out.println("Bonus rate:" + bonus);
		//thread
	}
}
