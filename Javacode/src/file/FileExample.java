package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/JAVA/PG_Module 6_Core Java");
		if (f.createNewFile())
		{
			System.out.println("File is Created");
		}
		else
		{
			System.out.println("File already exist");
		}
		Path p = Paths.get("D:/JAVA/PG_Module 6_Core Java");
		boolean status;
		status=Files.isReadable(p);
		System.out.println("File is Readable?" +status);
		
		String path1 = f.getPath();
		System.out.println("path" +path1);
		
		String path2 = f.getCanonicalPath();
		System.out.println(" Canonical path" +path2);
		} 
}


        //another method
/*
package file;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/test.txst");
		try {
		if (f.createNewFile())
		{
			System.out.println("File is Created");
		}
		else
		{
			System.out.println("File already exist");
		}
		} catch (IOException e) {
		//TODO Auto-generated catch block
		        e.printStackTrace();
	   }
	}
}
*/

   //another method
/*
package file;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/test.txst");
		if (f.createNewFile())
		{
			System.out.println("File is Created");
		}
		else
		{
			System.out.println("File already exist");
		}
		} 
}
*/
 
     // another method
/*
package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/JAVA/test.txst");
		if (f.createNewFile())
		{
			System.out.println("File is Created");
		}
		else
		{
			System.out.println("File already exist");
		}
		Path p = Paths.get("D:\\JAVA\\test.txst");
		boolean status;
		status=Files.isWritable(p);
		System.out.println("File is Writtable?" +status);
		} 
}

*/


