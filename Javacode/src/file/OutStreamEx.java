package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutStreamEx {

	public static void main(String[] args) {
		try {
			OutputStream o = new FileOutputStream("D:\\JAVA\\test.txst");
			o.write(76);
			o.write(67);
			o.write(68);
			o.close();
			System.out.println("Successfully created and written the file.");
		} catch (IOException e) {
			System.out.println("Exception");
		}

	}

}