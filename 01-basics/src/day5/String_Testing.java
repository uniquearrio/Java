package day5;

public class String_Testing {
	public static void main(String[] args) {
		
		String s1 = new String(new char[] {'Y' , 'W', 'K'});
		String s2 = new String("Java Programming");
		String s3 = "Myanmar IT Consulting";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.toUpperCase());
		
		var substr = s2.substring(0, 4);
		System.out.println("Substring  " + substr);
		
		System.out.println(s2.substring(8));
		
		System.out.println("Replace: " + s2.replace("Java", "spring"));
		
		System.out.println("concat" + s2.concat("Language"));
		
		System.out.println();
		
	}
}
