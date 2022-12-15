package exceptionEx;

public class ExceptionCatch {

	public static void main(String[] args) {
           
		try
		{
			int[] numbers = {1,2,3};
			System.out.println(numbers[60]);
		}
		catch (Exception e)
		{
			System.out.println("Some birds are singing");
		}

	}

}
