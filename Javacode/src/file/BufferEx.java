package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferEx {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		{
			System.out.println("Enter Your Name : ");
			String name1 = br.readLine();
			
			System.out.println("Enter Your Age :");
			int age1 = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Your Percentage :");
			float percentage1 = Float.parseFloat(br.readLine());
			
			System.out.println("My Name is :" +name1);
			System.out.println("My Age is :" +age1);
			System.out.println("My Percentage is :" +percentage1);
		}

	}

}
