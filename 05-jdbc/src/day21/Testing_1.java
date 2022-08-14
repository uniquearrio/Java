package day21;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Testing_1 {
	public static void main(String[] args) {
		try(Connection con= DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","root","");){
			System.out.println("Create Connection Object");
			
			Statement st = (Statement) con.createStatement();		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
