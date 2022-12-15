package interFace;

interface APPU
{
	public void print_APPU();
}
interface PAPA
{
	public void print_PAPA();
}
interface LOVE extends APPU,PAPA
{
	public void print_LOVE();
}
class child implements LOVE{
	public void print_APPU()
	{
		System.out.println("Cooking Together");
	}
	public void print_PAPA()
	{
		System.out.println("Hugging Each Other");
	}
	public void print_LOVE()
	{
		System.out.println("Having Kids");
	}
	
}
public class InheritanceEx {

	public static void main(String[] args) {
		child d=new child();
		d.print_APPU();
		d.print_PAPA();
		d.print_LOVE();

	}

}
