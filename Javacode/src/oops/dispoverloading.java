package oops;

public class dispoverloading {
	public void disp(char a)
	{
		System.out.println(a);
	}
	public void disp(int b,int num)
	{
		System.out.println(b+num);
	}

	public static void main(String[] args) {
		dispoverloading obj=new dispoverloading();
		obj.disp('a');
		obj.disp(5,6);

	}

}
