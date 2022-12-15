package stringEx;

public class StringExample {

	public static void main(String[] args) {
		String str= new String("This is a Java Program");
		System.out.println("Length : "+str.length());
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(4,  18));
		
		String str1= new String("and this is a secure language.");
		
		System.out.println(str.concat(str1));
		
		str= str.concat(str1);
		
		System.out.println(str);
		
		System.out.println(str.charAt(18));
		
		System.out.println("Length : "+str.length());
		
		System.out.println(str.contains("secure"));
		System.out.println(str1.indexOf("secure"));
		
		String st= str1.valueOf(9696);
		System.out.println(st);
		
		//String str2= new String("This is a Java Program");
		//System.out.println("Compare Strings : "+str.compareTo(str2));
	}

}
