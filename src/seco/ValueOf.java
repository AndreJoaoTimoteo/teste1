package seco;

public class ValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Boolean.valueOf(true));
		System.out.println(Boolean.valueOf("false"));
		System.out.println(Integer.valueOf("1337"));
		
		Integer i = new Integer(125);
		Integer j = i;
		System.out.println(i==j);
		i++;
		System.out.println("i = "+i+", j = "+j);
		System.out.println(i==j);
	}

}
