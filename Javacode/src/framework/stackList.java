package framework;

import java.util.Stack;

public class stackList {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.isEmpty(); //true or false
		System.out.println("Check stack empty?"+stack.isEmpty());
		stack.push("16");
		stack.push("26");
		stack.push(null);
		stack.push("46");
		stack.push("66");
		System.out.println("Initial stack:"+stack);
		String element = stack.pop();
		System.out.println("Removed Element:"+element);
		String element1 = stack.peek();
		System.out.println("Element at top:"+element1);	

	
		
		

	}

}
