package terc;

import java.util.TreeSet;

public class dudeTreesLmao {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(500);
		
		System.out.println(set.headSet(300));
		
		TreeSet set2 = new TreeSet<>();
		set2.add(100);
		set2.add(200);
		set2.add(300);
		set2.add(400);
		set2.add(500);
		set2.add(600);
		
		System.out.println(set.tailSet(300));
		
		System.out.println(set2.subSet(100, 450));
		
	}

}
