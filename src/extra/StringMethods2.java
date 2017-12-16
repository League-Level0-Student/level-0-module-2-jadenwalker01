//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import java.util.Random;

public class StringMethods2 {
	public static void main(String[] args) {
		int random = new Random().nextInt(8);	
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
String loop = "JjGHgfvF";
		// 2. Print your String to the console in upper case.
	//	System.out.println(loop.toUpperCase());
		// 3. Print your String to the console in lower case.
//		System.out.println(loop.toLowerCase());
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
	//	System.out.println(loop.substring(0,3));
		// 5. Print a RANDOM single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
//		System.out.println(loop.charAt(random)); 
System.out.println(loop.substring(loop.length()-3, loop.length()));

		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		
	}
}

