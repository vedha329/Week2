package week3.day1;


import java.util.LinkedHashSet;
import java.util.Set;

public class Setduplicate {

	public static void main(String[] args) {

		
		
		
		
		Set<Character> unique = new LinkedHashSet<Character>();
		String temp = "google";
		char[] CharArray = temp.toCharArray();
		for(int i=0; i < CharArray.length; i++) { 
		unique.add(CharArray[i]);
		
		}
		System.out.println("word:" +unique);
	}

}
