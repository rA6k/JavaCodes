package framework;
import java.util.LinkedList;
import java.util.Iterator;

public class linkedList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		LinkedList<Integer> l = new LinkedList<>();
		ll.add("Shainika");
		ll.add("Shalini");
		ll.add(null);
		ll.add(0,"Udhayadevi");
		ll.add("Dharani");
		System.out.println("List of elements:"+ll);
		System.out.println("get value from list:"+ll.get(2));
		Iterator i = ll.descendingIterator();
		while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }
		System.out.println("remove element from list:"+ll.remove(3));
		System.out.println("List of elements:"+ll);
		

		


	}

}
