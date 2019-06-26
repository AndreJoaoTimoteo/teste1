package terc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class listaTipada {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
		list.add(1);
		list.add("A");
		list.add("B");
		
		list.forEach(new Consumer<Object>() {
			@Override
			public void accept(Object n) {
				System.out.println(n);
			}
		});
		
		list.forEach((n) -> System.out.println(n));	
	}
}
