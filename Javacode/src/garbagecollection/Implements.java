package garbagecollection;

public class Implements {

	public static void main(String[] args) {
		try{
			int a=6,b=0,c;
			c=a/b;
			System.out.println("result:"+c);

			}
			catch(Exception e){
			System.out.println(e);
			}
			finally{
			System.out.println("Final block");
			}


	}

}
