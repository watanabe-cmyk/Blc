package model;

import data.DataRetention;

public class BookRegister {

	public static void register(String title, String kinds) {
		Book book = new Book(title, kinds);
		DataRetention.addbook(book);
	}

	public static int getMaxId() {

		int maxId = 0;

		for (Book book : DataRetention.getList()) {

			if (book.getId() > maxId) {
				maxId = book.getId();
			}

		}

		return maxId;
	}

}
