package garbagecollection;

public class FinalVariable {
	final int speedlimit = 90; //final variable
	void run() {
		speedlimit = 400;
	}

	public static void main(String[] args) {
		FinalVariable fv = new FinalVariable();
		fv.run();

	}

} //end of class
