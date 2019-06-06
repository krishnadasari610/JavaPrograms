package stringsprograms;

public class StringExamples {

	public static void main(String[] args) {
		
		/*Strings in Java are objects
		 * Strings are immutable
		 * String is the only class which supports the operator overloading in java.
		 * we can concatenate any two string by using "+" operator. 
		 */
		
		//simple string 
		String s = "Learn new languages";
		System.out.println(s);
		String sn = "gain more knowledge";
		//String concatenation 
		System.out.println(s +"========" + sn);
		//String replace with old to new at specified word
		String s1 = "new languages are always welcome to other languages to learn Languages";
		System.out.println(s1.replace("to","the"));
		//String s2=s1.replace("to","the");
		//System.out.println(s1);
		//System.out.println(s2);
		//String length, printing of substrings from specified character  of the string
		String ss = "new languages are always welcome to other languages to learn Languages";
		System.out.println(ss.length());
		System.out.println(ss.substring(4));
		System.out.println(ss.substring(4,35));
		
		//String comparision
		String h = "hello world";
		String h1= "Hello World";
		System.out.println(h.equals(h1));
		System.out.println(h.equalsIgnoreCase(h1));
		System.out.println(h==h1);
	}
	
	
}
