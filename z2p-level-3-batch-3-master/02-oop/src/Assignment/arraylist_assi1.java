package Assignment;

import java.util.ArrayList;

import java.util.Collections;

public class arraylist_assi1 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Maung Maung");
		name.add("Mya Mya");
		name.add("Kyaw Kyaw");
		name.add("Zaw Zaw");
		name.add("Lia");
		
		System.out.println(name);
		name.sort(null);
		System.out.println("After sorting:" + name);
		
		int index = Collections.binarySearch(name,"Lia");
		System.out.println((index>0 ? "Found ": "Not found ") + "and" + "index is: " + index);
		
		if(name.contains("Yeji")){
			System.out.println("name is already in here");
		}else {
			name.add("Yeji");
			name.sort(null);
			System.out.println("After add list :" + name);
		}
		
		var kguy = new ArrayList<>();
		for(String s: name) {
            if(s.startsWith("k") || s.startsWith("K")) {
                kguy.add(s);
            }
        }
		
        System.out.println(kguy);
		
		name.removeIf(g->g.endsWith("g")||g.endsWith("G"));
		System.out.println("After remove: " + name);
		name.clear();
	}
}
