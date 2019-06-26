package terc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class apagarSe {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
		list.add(1);
		list.add("A");
		list.add("B");
		list.add(2);
		
		list.removeIf(new Predicate<Object>() {

			@Override
			public boolean test(Object t) {
				// TODO Auto-generated method stub
				return t instanceof Integer;
			}
		});
		System.out.println(list);
		
		list.removeIf(n -> (n instanceof String));
		System.out.println(list);
		}

}
