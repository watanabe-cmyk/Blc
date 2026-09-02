package model;

import data.DataRetention;
import input.InputControl;
import menu.Menu;

public class BookUpdata {
	public static void updata(int a) {
		for (Book book : DataRetention.getList()) {
			if (book.getId() == a) {
				Menu.updata();
				switch (InputControl.inter("英数")) {
				case 1:
					book.setTitle(InputControl.str("タイトル"));
					break;

				case 2:
					book.setKinds(InputControl.str("ジャンル"));
					break;
				default:
					break;
				}
			}
		}
	}

}
