package quar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Frogdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random coiso = new Random();
		List<Integer> stats = new ArrayList<Integer>();
		List<Integer> rolls = new ArrayList<Integer>();
		int soma = 0;
		
		
		/*for (int i=0;i<10;i++)
			System.out.println(1+coiso.nextInt(19));*/
		for (int j=0;j<6;j++) {
			for (int s=0;s<4;s++) {
				rolls.add(1+coiso.nextInt(6));
			}
			rolls.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o1.compareTo(o2);
				}
			});
			
			rolls.remove(0);
			for (int v=0;v<3;v++)
				soma += rolls.get(v);
			stats.add(soma);
			rolls.clear();
			soma=0;
			
		}
		System.out.println(stats);
		for (int i=0;i<6;i++)
			soma+=stats.get(i);
		System.out.println(soma);

	}

}
