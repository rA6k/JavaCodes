package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args){
		  Employee e = null;
		  try
		  {
	      FileInputStream fi = new FileInputStream("D:\\JAVA\\test.txst");
	      ObjectInputStream oi = new ObjectInputStream(fi);
	      e = (Employee)oi.readObject();
	      oi.close();
	      fi.close();
		  }catch(IOException i)
		  {
			  i.printStackTrace();
			  return;
		  }catch(ClassNotFoundException c)
		  {
	    	  System.out.println("Employee class not found");
	    	  c.printStackTrace();
		      return;
		  }
	     System.out.println("Deserialized Employee..."); 
	     System.out.println("Name:" +e.name);
	     System.out.println("Address:" +e.address);

	}

}
