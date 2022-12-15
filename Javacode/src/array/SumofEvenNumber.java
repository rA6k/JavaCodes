package array;

public class SumofEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6, sumEven=0;
		while (num<=10) {
			if (num % 2 == 0) {
				sumEven = sumEven + num;
			}
			num++;
		}
		System.out.println("Sum of Even Number is" +sumEven);
	}

}
