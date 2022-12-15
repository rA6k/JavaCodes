package array;

public class Avg {

	public static void main(String[] args) {
		int[ ] num = new int[7];
		
		num[0]=06;
		num[1]=16;
		num[2]=26;
		num[3]=36;
		num[4]=46;
		num[5]=56;
		num[6]=66;
		
		double avg = 0.0;
		int sum = 0;
		//Find the sum of these numbers.
		for (int i = 0; i < 6; i++)
		sum = sum + num[i];
		avg = (double)sum/7;
		System.out.println("Sum of seven nembers:" +sum);
		System.out.println("Average of seven nembers:" +avg);
		
		

	}

}
