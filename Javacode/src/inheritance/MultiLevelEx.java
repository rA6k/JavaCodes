package inheritance;

//parent class
 class Car
 {
	 public Car()
	 {
		 System.out.println("Class car");
		 
		 
	 }
	 public void vehicleType() {
		 System.out.println("Vehicle Type:car");
	 }
 } 
 //child class
 class Maruti extends Car
 {
	 public Maruti()
	 {
		 System.out.println("Class:Maruti");
	 }
	 public void brand()
	 {
		 System.out.println("Brand:Maruti");
	 }
	 public void speed()
	 {
		 System.out.println("Max:90kmph");
	 }
 }
 public class MultiLevelEx extends Maruti{

public MultiLevelEx ()
{
	System.out.println("Maruti model:800");
}

	public static void main(String[] args) {
		MultiLevelEx obj=new MultiLevelEx();
		obj.vehicleType();
		obj.brand();
		obj.speed();
		

	}

}
