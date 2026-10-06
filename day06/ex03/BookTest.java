package ex03;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		Book[] b = { new Book(15000), new Book(50000), new Book(20000) };
		
		System.out.println("정렬 전");
		for(Book book : b) {
			System.out.println(book);
		}
		
		System.out.println(" ");
		Arrays.sort(b);
		
		System.out.println("정렬 후");
		for(Book book : b) {
			System.out.println(book);
		}
	}
}