package ConstuctorEx;

public class SuperMethod extends SuperClass {
	public SuperMethod() {
		super("Java");
	}

	public static void main(String[] args) {
		SuperMethod supermethod = new SuperMethod();

	}

}
   class SuperClass{
	   SuperClass(String name) {
		   System.out.println("This constructor received name argument " + name);
	   }
   }