package model;

import data.DataRetention;

public class BookDelete {
	public static void delete(int id) {
		DataRetention.getList().removeIf(book -> book.getId() == id);
	}
}
