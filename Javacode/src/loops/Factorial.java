package loops;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,fact = 1;
		int num=6;
		for (i = 1; i <= num; ++i)
		{
			fact = fact * i;
			
			}
		      System.out.printf("Factorial of "+num+" is:" +fact);

	}

}
