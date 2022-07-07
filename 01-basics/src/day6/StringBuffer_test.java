package day6;

public class StringBuffer_test {

		public static void main(String[] args) {
			StringBuffer buffer = new StringBuffer("Java Programming");
			buffer.append("Language");
			
			System.out.println("After append, buffer: " + buffer);
			
			buffer.insert(5, "is a ");
			System.out.println("Afteer insert buffer: " + buffer);
			
			buffer.replace(0, 4, "PHP");
			System.out.println("After replace buffer: " + buffer);
			
			System.out.println("index of 'Language': " + buffer.indexOf("Language"));
		}
}
