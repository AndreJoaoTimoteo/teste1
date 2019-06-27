package quar;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void a() throws Exception{
	}
	
	public void b(String string) {
		
		string.isEmpty();
	}
	
	public void c() {
		
		try {
			b (null);
			
			System.out.println(123);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	

}
