package framework;
import java.util.HashMap;
public class hashMapList {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "black");
		map.put(2, "purple");
		map.put(3, "blue");
		map.put(4, "darkgreen");
		map.put(5, "pink");
		map.put(6, "black");
		System.out.println("Element in my HashMap:"+map);
		
		//check if value black is present
		if (map.containsValue("black")) 
		{
			System.out.println("black colour is present on the list");
		}
		if(! map.containsValue("purple"))
		{
			map.put(1,"purple");
		}
		System.out.println("Updated HaspMap:\n" +map);


	}

}
