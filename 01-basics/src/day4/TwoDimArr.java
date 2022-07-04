package day4;

public class TwoDimArr {
	public static void main(String[] args) {
		int [] [] marks = {
				{10,20,30,40,50,60,},
				{1,3,5,7,9,11,33,15},
				{78,50,14,60,94,}
		};
		
		String[] names = {"Jonn" ,"Yuri" ,"Sorrow"};
		//output
		for(var r = 0; r<3; r++) {
			for(var c = 0; c<5; c++) {
				System.out.print(marks[r][c] + "/t");
			}
			System.out.println();
		}
	}
}
