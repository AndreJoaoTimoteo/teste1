package terc;

import java.util.ArrayDeque;

public class Dequiu {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque queue = new ArrayDeque<>();
		queue.addFirst(new Pessoa("Antonio", 32));
		queue.addFirst(new Pessoa("Fabio", 25));
		queue.addFirst(new Pessoa("João", 16));
		queue.addFirst(new Pessoa("José", 32));
		queue.addFirst(new Pessoa("Maria", 10));
		
		System.out.println(queue.peek());
		System.out.println(queue.getFirst());
		System.out.println(queue.getLast());
	}

}
