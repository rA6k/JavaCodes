package staticMethod;

public class Operation {
	static int add(int x,int y) {
		return x*y;
	}
	int multiply(int a,int b) {
		return a*b;
	}
	void sub (int a,int b) {
		System.out.println("Subtraction: "+(a-b));
	}

	public static void main(String[] args) {
		int result = Operation.add(10, 6);
		System.out.println("Sum: "+result);
		Operation op = new Operation ();
		int mul = op.multiply(2,3);
		System.out.println("Multiplication: "+mul);
		op.sub(10, 4);

	}

}
