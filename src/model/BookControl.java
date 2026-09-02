package model;

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
}
