package day13;

import java.util.List;

public class Lambda_with_collection {
	public static void main(String[] args) {
		List<String> languages = List.of("Java","HTML","Python","PHP");
		
		//languages.forEach(langs->System.out.println(langs));
		
		languages.forEach(lang->{
			if(lang.contains("Java")) {
				System.out.println(lang);
			}
		});
	}
}
