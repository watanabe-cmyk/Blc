package model;

import data.DataRetention;
import input.InputControl;
import menu.Menu;

public class BookDetail {
	public static void detail(int a) {
		for (Book book : DataRetention.getList()) {
			if (book.getId() == a) {
				String loan;
				if (book.isLoan() == false) {
					loan = "未貸出";
					System.out.println("ID: " + book.getId()
							+ ", タイトル: " + book.getTitle()
							+ ", ジャンル: " + book.getKinds()
							+ "、返却期限:" + book.getDeadline()
							+ "、貸出状況:" + loan);
				} else {
					loan = "貸出中";
					System.out.println("ID: " + book.getId()
							+ ", タイトル: " + book.getTitle()
							+ ", ジャンル: " + book.getKinds()
							+ "、返却期限:" + book.getDeadline()
							+ "、貸出状況:" + loan);
				}
				Menu.updata2();
				switch (InputControl.inter("英数")) {
				case 1:
					BookControl.updata(a);
					break;

				case 2:
					BookControl.delete(a);
					break;

				default:
					break;
				}

			}
		}
	}

}
