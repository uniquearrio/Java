package day5;

public class String_Testing {
	public static void main(String[] args) {
		
		String s1 = new String(new char[] {'Y' , 'W', 'K'});
		String s2 = new String("Java Programming is one of the best programming languages");
		String s3 = "Myanmar IT Consulting";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.toUpperCase());
		
		var substr = s2.substring(0, 4);
		System.out.println("Substring  " + substr);
		
		System.out.println(s2.substring(8));
		
		System.out.println("Replace: " + s2.replace("Java", "spring"));
		
		System.out.println("concat" + s2.concat("Language"));
		
		
		System.out.println("Start with php:" + s2.startsWith("php"));
		
		System.out.println("End with php:" + s2.endsWith("php"));
		
		//location
		System.out.println("index of 'a' " + s2.indexOf("a"));
		
		System.out.println("index of 'a' " + s2.lastIndexOf("a"));
		
		System.out.println("index of 'abc' : " + s2.indexOf("abc"));
		
		String[] data = s2.split(" ");
		System.out.println(data[0]);
		System.out.println(data.length);
		char[] characters = s2.toCharArray();
		
		String s4 = String.valueOf(characters);
		System.out.println(s4);
	}
}
