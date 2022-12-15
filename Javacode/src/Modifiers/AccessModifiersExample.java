package Modifiers;

class ParentClass{
	   int a = 20;
	   public int b = 40;
	   protected int c = 60;
	   private int d = 80;
	   void showData()  {
		   System.out.println("Inside ParentClass");
		   System.out.println("a = " + a);
		   System.out.println("b = " + b);
		   System.out.println("c = " + c);
		   System.out.println("d = " + d);
	   }
	
}
  class ChildClass extends ParentClass{
	  void accessData() {
		  System.out.println("Inside ChildClass");
		   System.out.println("a = " + a);
		   System.out.println("b = " + b);
		   System.out.println("c = " + c);
		  // System.out.println("d = " + d); // private member can't be accessed
		  
	  }
  }

public class AccessModifiersExample {

	public static void main(String[] args) {
	ChildClass obj = new ChildClass();
	obj.showData();
	obj.accessData();

	}

}
