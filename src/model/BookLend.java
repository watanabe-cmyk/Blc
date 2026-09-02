package model;

import java.time.LocalDate;

import data.DataRetention;
import input.InputControl;

public class BookLend {
	public static void lend(int a) {
		for (Book book : DataRetention.getList()) {
			if (book.getId() == a) {
				book.setLoan(true);
				LocalDate deadline = LocalDate.now().plusDays(InputControl.inter("貸出期間"));
				book.setDeadline(deadline);
			}
		}
	}

	public static void returnbook(int a) {
		for (Book book : DataRetention.getList()) {
			if (book.getId() == a) {
				book.setLoan(false);
				LocalDate deadline = null;
				book.setDeadline(deadline);
			}
		}
	}

}
