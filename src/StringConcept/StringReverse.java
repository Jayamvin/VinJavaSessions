package StringConcept;

import java.util.Arrays;
//convert string = "100Test"  to intiger and add 20 
//print full string in double quote "I love java coding"

public class StringReverse {

	public static String RevStr(String st) {
		// null check
		if (st == null) {
			System.out.println("String is null");
			// return null;
			// return "String is null";
			// return"-1";
		}
		
		//String is space
		if(st.isBlank()) {
			System.out.println("hiiii");
			return "hello";
		}

		int len = st.length();
		// length check
		if (len == 1 || len == 0) {
			return st;
		}

		String restr = " ";
		for (int i = (len - 1); i >= 0; i--) {
			restr = restr + st.charAt(i);
		}
		return restr;
	}

	public static void main(String[] args) {

		System.out.println(RevStr("rani"));
		System.out.println(RevStr("1234"));
		System.out.println(RevStr("A"));
		System.out.println(RevStr("null"));
		System.out.println(RevStr(""));
		System.out.println(RevStr("    "));

		String empInfo = "Hello Java Selenium";
		String emp[] = empInfo.split(" ");

		System.out.println(Arrays.toString(emp));

		StringBuilder sb = new StringBuilder(RevStr(emp[0]));
		System.out.println(sb.append(RevStr(emp[1])));
		System.out.println(sb.append(RevStr(emp[2])));
		System.out.println(sb);

		// there is a method to reverse sb.reverse()-- only for StringBuilder

		// this is just for understanding
//		String st1 = emp[0];
//		String st2 = emp[1];
//		String st3 = emp[2];
//		
//		System.out.println(st1);
//		System.out.println(ReverseString(st1));
//		System.out.println(ReverseString(st2));
//		System.out.println(ReverseString(st3));

//		String[] words =  "This is interview question".split(" ");
//
//		String rev = "";
//		for(int i = words.length - 1; i >= 0 ; i--)
//		{
//		   rev += words[i] + " ";
//		}
//
//		// rev = "question interview is This "
//
//		// can also use StringBuilder:
//		StringBuilder revb = new StringBuilder();
//		for(int i = words.length - 1; i >= 0 ; i--)
//		{
//		   revb.append(words[i]);
//		   revb.append(" ");
//		}
//		// revb.toString() = "question interview is This "

//		

	}

}
