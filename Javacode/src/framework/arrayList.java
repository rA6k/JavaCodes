package framework;
import java.util.*;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<Integer> l = new ArrayList<>();
		list.add("Apsal");
		list.add(0,"Faisal");
		list.add(null);
		list.add("Sarathy");
		list.add("Sanjay");
		list.add("Parthasarathy");
		list.add(2,"Ibrahim");
		System.out.println("List of elements:"+list);
		System.out.println("get value from list:"+list.get(1));
		System.out.println("set value from list:"+list.set(0, "Faisal"));
		System.out.println("remove element from list:"+list.remove(3));
		System.out.println("List of elements:"+list);
		System.out.println("Length of list:"+list.size());

	}

}
