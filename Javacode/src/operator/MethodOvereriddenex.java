package operator;
class vehicle {
	void vehicle1() {
		System.out.println("vehicle is running");
	}
}
class bike extends vehicle {
	void bike1() {
		System.out.println("Bike has 2 wheels");
	}
}
class car extends vehicle {
	void car1() {
		System.out.println("car has 4 wheels");
	}
}

public class MethodOvereriddenex {

	public static void main(String[] args) {
		vehicle V=new vehicle();
		bike b=new bike();
		car c=new car();
		V.vehicle1();
		b.bike1();
		c.car1();

	}

}
