package operator;
//parent class
class Bank
{
	int gerRatesOfInterest()
	{
		return 0;
	}
}
//creating child class
class SBI extends Bank
{
	int gerRateaOfInterest()
	{
		return 6;
	}
}
class ICIC extends Bank
{
	int gerRatesOfInterest()
	{
		return 16;
	}
} 
class AXIS extends Bank
{
	int gerRatesOfInterest()
	{
		return 26;
	}
}
public class OverridingEx {

	public static void main(String[] args) {
		SBI s=new SBI();
		ICIC i=new ICIC();
		AXIS a=new AXIS();
		System.out.println("SBI rates of interest:"+s.gerRateaOfInterest());
		System.out.println("ICIC rates of interest:"+i.gerRatesOfInterest());
		System.out.println("AXIS rates of interest:"+a.gerRatesOfInterest());

	}

}
