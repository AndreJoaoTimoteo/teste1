package quar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SimulaFileNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("/tmp/arq.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
