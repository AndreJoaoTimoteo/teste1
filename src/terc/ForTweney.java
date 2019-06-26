package terc;

import java.util.Arrays;
import java.util.HashMap;

public class ForTweney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("A", "1");
		map.put("B", Arrays.asList("1","2"));
		
		/*1
		 * System.out.println(map);
		 * map.clear();
		 * System.out.println(map);*/
		
		/*2
		* System.out.println("A -> " + map.get("A"));
		* System.out.println("B -> " + map.get("B"));
		*/
		
		System.out.println(map);
	}

}
