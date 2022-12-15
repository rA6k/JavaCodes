package interFace;

interface Daisy
{
	public void Daisy();
}
interface Rose extends Daisy
{
	public void Rose();
}
interface Lily extends Daisy
{
	public void Lily();
}

public class Flowers implements Rose,Lily {
	
	public void Daisy()
	{
		System.out.println("Inside Daisy");
	}
	public void Rose()
	{
		System.out.println("Inside Rose");
	}
	public void Lily()
	{
		System.out.println("Inside Lily");
	}

	public static void main(String[] args) {
		Flowers obj1=new Flowers();
		obj1.Daisy();
		obj1.Rose();
		obj1.Lily();

	}

}
