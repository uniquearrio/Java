package Assignments;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		String[] cores = {"corei3","corei5","corei7","corei9"};
		String[] [] prices = {
				{"lenovo","hp","samsung","acer","dell","asus"},
				{"230.21","400.21","294.2","693.33","340.44","691.99"},
				{"529.483","920.483","676.66","1594.659","783.012","1591.577"},
				{"552.504","960.483","1663.992","706.08","817.056","1660.776"},
				{"690.63","1200.63","882.66","2079.99","1021.32","2091.97"},
		};
		
		for(var r=0;r<5;r++) {
			for(var c=0;c<6;c++) {
				System.out.println(prices[r][c] +"");
			}
			System.out.println();
		}
		
		
	}
	public static int kyat(float x){
		int price = (int) (x * 1851.26);
		return price;
	}
}

