package loops;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,r,x,y;
		System.out.println("Enter value a");
		a=sc.nextInt();
		System.out.println("Enter value r");
		r=sc.nextInt();
		for(y=a;y<=r;y++)
		{
			System.out.println("Table of "+y+"\r");
			for (x=1;x<=10;x++)
			{
				System.out.print(y*x+"\t");
			}
		      System.out.println();
		}

	}

}
