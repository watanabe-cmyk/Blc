package data;

import java.util.ArrayList;

import model.Book;

public class DataRetention {

	private static ArrayList<Book> booklist = new ArrayList<>();

	public static ArrayList<Book> getList() {
		return booklist;
	}

	public static ArrayList<Book> addbook(Book book) {
		booklist.add(book);
		return booklist;
	}

}
