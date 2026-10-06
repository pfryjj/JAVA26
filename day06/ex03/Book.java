package ex03;

public class Book implements Comparable<Book> {
	int price;
	
	public Book(int price) {
		this.price = price;
	}

	public int compareTo(Book b) {
		return this.price - b.price;
	}

	public String toString() {
		return "Book [price=" + price + "]";
	}
}