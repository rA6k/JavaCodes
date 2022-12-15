package exceptionEx;

public class TestThrowAndThrows {
	//defining a user defined method which throws ArithmeticException
	static void method() throws ArithmeticException
	{
		System.out.println("Inside the method()");
		throw new ArithmeticException("Throwing ArithmeticException");
	}

	public static void main(String[] args) {
		try
		{
			method();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught in main()method");
		}

	}

}
