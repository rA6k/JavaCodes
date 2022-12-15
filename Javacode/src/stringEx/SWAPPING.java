package stringEx;

public class SWAPPING {
	
int x,z;
	
	// call by reference
	
	void swap(SWAPPING s)
	{
		int a;
		
		a = s.x;
		s.x = s.z;
		s.z = a;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SWAPPING obj = new SWAPPING();
		obj.x=90;
		obj.z=78;
		
		System.out.println("Before Swapping  \n");
		System.out.println("X: "+obj.x);
		System.out.println("Z: "+obj.z);
		
		obj.swap(obj);
		
		System.out.println("After Swapping  \n");
		System.out.println("X: "+obj.x);
		System.out.println("Z: "+obj.z);

	}

}
