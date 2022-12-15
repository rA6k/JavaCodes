package stringEx;

public class ReverseNumbers {

	public static void main(String[] args) {
		int num=2327, reverse=0;
		
		System.out.println("Original Number: " + num);
		
		//run loop until num becomes 0
		while (num!=0)
		{
			
			//get last digit from num
		int digit = num %  10;
		reverse = reverse * 10 + digit;
		
		//remove the last digit from num
		num/=10;
		System.out.println("ReversedNumber is:" + reverse);

		}
	}

}
