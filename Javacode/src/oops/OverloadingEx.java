package oops;

public class OverloadingEx {
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		OverloadingEx obj=new OverloadingEx();
		obj.sum(60,60);
		obj.sum(60,60,60);

	}

}
