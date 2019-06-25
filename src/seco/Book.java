package seco;

public class Book {

	private String isbn;
	
	public Book (String isbn) {
		this.setIsbn(isbn);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String is = "Horus";
		Book book1 = new Book(is);
		Book book2 = new Book(is);
		
		System.out.println(book1.equals(book2));
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
