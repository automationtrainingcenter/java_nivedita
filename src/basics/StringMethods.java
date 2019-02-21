package basics;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "";
		
		String s3 = " webdriver";
		String s4 = "AHALYA";
		String s5 = "welcome to the selenium course with Java programming launguage";
		String s6 = "                          actual text                          ";
		/*
		 * length() : which will return an integer value which is the number of
		 * characters in the given string
		 */
		System.out.println("number of characters in s1 is "+s1.length());
		System.out.println("number of characters in s3 is "+s3.length());
		
		/* isEmpty() : returns true if a given string is an empty string */
		System.out.println("string s2 is an empty string "+s2.isEmpty());
		System.out.println("string s3 is an empty string "+s3.isEmpty());
		
		/* concat(): combines two given strings */
		System.out.println(s1.concat(s3));
		System.out.println("before concat s1 is "+s1);

		s1 = s1.concat(s3);
		System.out.println("after concat s1 is "+s1);
		System.out.println(s3);
		
		/* equals(): verifies two strings by considering case */
		System.out.println(s4.equals("ahalya"));
		System.out.println(s1.equals("selenium webdriver"));
		System.out.println(s1.equals(s3));
		
		/*
		 * equalsIgnoreCase(): verifies two strings are equal or not without considering
		 * the case
		 */
		System.out.println(s4.equalsIgnoreCase("ahalya"));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		/*
		 * contains(): verifies a given substring is available inside the given string
		 * or not
		 */
		System.out.println(s1.contains("driver"));
		System.out.println(s5.contains(s1));

		/* toLowerCase(): converts given string to lower case */
		System.out.println(s4.toLowerCase());
		System.out.println(s4);
		
		/* toUpperCase(): converts given string to upper case */
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		/* charAt(): returns a character at a given index number */
		System.out.println(s1.charAt(7));
		
		/* indexOf(): returns index value of first occurrence of a given character */
		System.out.println(s1.indexOf('i'));
		System.out.println(s5.indexOf("Java"));
		
		/* stratsWith(): verifies a given string starts with given substring */
		System.out.println(s1.startsWith("sel"));
		System.out.println(s5.startsWith("Welcome"));
		
		/* endsWith(): verifies a given string ends with given substring */
		System.out.println(s1.endsWith(s3));
		System.out.println(s5.endsWith("Age"));
		
		/*
		 * replace(): it will replace given old character or old substring with new
		 * character or new substring
		 */
		System.out.println(s1.replace('e', 'E'));
		System.out.println(s5.replace("Java", "Python"));
		
		/*
		 * substring(): returns substring from a given string based on beginning and
		 * optional ending index values
		 * Note: substring() will include the beginning index character and excludes ending
		 * index character
		 */
		System.out.println(s1.substring(9));
		System.out.println(s1.substring(9, 12));
		

		/* toCharArray() return an array of characters inside the given string */
		char[] characters = s1.toCharArray();
		System.out.println("number of characters in my character array "+characters.length);
		System.out.println(characters[2]);
		
		/*
		 * split() return an array of substrings inside the given string, divided based
		 * on some expression
		 */
		String[] words = s5.split(" ");
		System.out.println("number of words in s5 string " +words.length);
		System.out.println(words[3]);
		
		/*
		 * trim() which will remove extra spaces at beginning and ending of given string
		 */
		System.out.println("before removing spaces s6 is "+s6);
		System.out.println("after removing spaces s6 is "+s6.trim());

	}

}
