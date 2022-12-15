package oops;
class Area
{
	//Fields to calculate area
	int length;
	int breath;
	//constructor to intialize the value
	Area (int length, int breath)
	{
		this.length=length;
		this.breath=breath;
	}
	//method to calculate area
	public void getArea()
	{
		int area=length*breath;
		System.out.println("Area:"+area);
	}
}

public class EncapsulationEx {

	public static void main(String[] args) {
		//create object of area
		//pass the value of length and breath
		Area rectangle=new Area(10,6);
		rectangle.getArea();

	}

}
