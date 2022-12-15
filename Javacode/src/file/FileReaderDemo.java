package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\JAVA\\test.txst");
		BufferedReader br =new BufferedReader(fr);
		int i;
		while((i = br.read())!=-1)
		{
			System.out.println((char)i);
		}
		br.close();
		fr.close();

	}

}
