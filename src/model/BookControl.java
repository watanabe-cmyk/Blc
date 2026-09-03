package model;

import data.DataRetention;
import input.InputControl;

public class BookControl {
	public static void lend() {
		BookLend.lend(InputControl.inter("id"));
	}

	public static void returnbook() {
		BookLend.returnbook(InputControl.inter("id"));
	}

	public static void creat() {
		BookRegister.register(InputControl.str("タイトル"), InputControl.str("ジャンル"));
	}

	public static void updata(int a) {
		BookUpdata.updata(a);
	}

	public static void delete(int a) {
		BookDelete.delete(a);
	}

	public static void sortKinds() {
		DataRetention.getList().sort((book1, book2) -> book1.getKinds().compareTo(book2.getKinds()));
	}

	public static void search(String title) {
		for (Book book : DataRetention.getList()) {
			if (book.getTitle().contains(title)) {
				System.out.println("ID: " + book.getId() + ", タイトル: " + book.getTitle());
			}
		}
	}
}
