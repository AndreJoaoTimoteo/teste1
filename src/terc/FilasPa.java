package terc;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

@SuppressWarnings("unused")
public class FilasPa {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new PriorityQueue<>(/*new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				// TODO Auto-generated method stub
				return o2.getIdade().compareTo(o1.getIdade());
			}
		}*/);
		queue.add(new Pessoa("Antonio", 32));
		queue.add(new Pessoa("Fabio", 25));
		queue.add(new Pessoa("João", 16));
		queue.add(new Pessoa("José", 32));
		queue.add(new Pessoa("Maria", 10));
		
		System.out.println(queue.peek());
	}

}
