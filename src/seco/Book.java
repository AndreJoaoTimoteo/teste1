package seco;

public class Book {

	private String isbn;
		
	public Book(String isbn) {
		super();
		this.isbn = isbn;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	

}
