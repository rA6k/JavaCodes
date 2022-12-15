package oops;

public class OverLoadingExample {
	/*
	 * Function overloading is process where in function name and may be function return type will be same. But the argument
	 * list must be different
	 * 	Syntax:
	 * 			void sum(int a,int b){}
	 * 			void sum(float a,float b){}
	 * 
	 * 
	 */

		void main()
		{
			System.out.println("Void Main");
		}
		
		int main(int a,int b)
		{
			System.out.println("Int Main");
			return a+b;		
		}
		
		String main(String a,String b)	
		{
			System.out.println("String Main");
			return a.concat(b);
		}
		
		float main(float a,float b,float c)
		{
			System.out.println("Float Main");
			return a+b+c;		
		}
		int main(int a,int b,int c)
		{
			System.out.println("Int Main");
			return a*b*c;		
		}

	public static void main(String[] args) {
		OverLoadingExample obj = new OverLoadingExample();
		
		obj.main();
		
		System.out.println(obj.main(1, 1));
		System.out.println(obj.main("Hello ","Java"));
		System.out.println(obj.main(2, 4,3));
		System.out.println(obj.main(1.0f,2.0f,3.0f));

	}

}
