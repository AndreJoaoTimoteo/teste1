package quar;

import java.util.ArrayList;
import java.util.List;

public class SimularArrayOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> meuArray = new ArrayList<String>();
		meuArray.add("Valor 001");
		meuArray.add("Valor 002");
		meuArray.add("Valor 003");
		meuArray.add("Valor 004");
		meuArray.add("Valor 005");

		try {
			meuArray.get(-1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("My jaws that bite, my tries that catch!");
		}
	}

}
