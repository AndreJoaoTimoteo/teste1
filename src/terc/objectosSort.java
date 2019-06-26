package terc;

import java.util.Arrays;

public class objectosSort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pai[] array = new Pai[5];
		array[0]=new Pai(new Integer(1));
		array[1]=new Pai(new Integer(3));
		array[2]=new Pai(new Integer(5));
		array[3]=new Pai(new Integer(2));
		array[4]=new Pai(new Integer(4));
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
