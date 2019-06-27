package quar;

public class SimulaArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1 = 10;
		int valor2 = 0;
		try {
		System.out.println(valor1/valor2);
		} catch (ArithmeticException e) {
			System.out.println("pls no dividerino by zerorino, kripperino");
		}
	}

}
