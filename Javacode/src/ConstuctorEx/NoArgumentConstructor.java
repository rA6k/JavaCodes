package ConstuctorEx;

public class NoArgumentConstructor {
	int i;
	NoArgumentConstructor() {
		i=26;
		System.out.println("Creating noargument constructor");
		System.out.println("i-"+i);
	}

	public static void main(String[] args) {
		NoArgumentConstructor skill=new NoArgumentConstructor();

	}

}
