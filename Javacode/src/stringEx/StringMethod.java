package stringEx;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String declaration without using new operator
		String a="AppuPapa";
		System.out.println("String a=" +a);
		//String declaration using new operator
		String b=new String("Love");
		System.out.println("String b=" +b);
		//Some String methods
		System.out.println("The length of the String:" +a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a+b);
		System.out.println(a.concat(b));
		System.out.println("Character at position 6:"+a.charAt(6));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.compareTo(b));
		System.out.println(a.contains("a"));

	}

}
