package terc;

import java.util.Arrays;

public class sortir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[5];
		for (int i=0; i<5; i++)
			array[i]=(int)(i*Math.pow(-1,i));
		
		System.out.println(Arrays.toString(array));
		int[] newArray = Arrays.copyOfRange(array, 1, 3);
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int[] newArray2 = Arrays.copyOfRange(array, 1, 3);
		
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(newArray2));
		
		
	}

}
