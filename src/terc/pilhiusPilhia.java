package terc;

import java.util.Stack;

public class pilhiusPilhia {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack list = new Stack<>();
		list.push(1);
		list.push("A");
		list.push("B");
		
		System.out.println(list);
		
		System.out.println(list.peek());
		
		System.out.println(list.pop());
		
		System.out.println(list);
	}

}
