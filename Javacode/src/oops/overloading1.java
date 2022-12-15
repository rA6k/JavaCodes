package oops;

public class overloading1 {
	void sum(int a,double b)
	{
		System.out.println(a+b);
	}
	void sum(double b,int a)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		overloading1 obj=new overloading1();
		obj.sum(60,60.0);
		obj.sum(60.0,60);

	}

}
