package garbagecollection;

public class FinalMethodHonda {
	final void run() {
		System.out.println("Running");
	}
}
	class Honda extends FinalMethodHonda {
		void run() {
			System.out.println("Running safely with 100kmph");
		}	

	public static void main(String[] args) {
		 FinalMethodHonda  FinalMethodHonda = new  FinalMethodHonda();
		 FinalMethodHonda.run();

	}

}
