package menu;

import data.DataRetention;
import model.Book;
import model.BookDetail;

public class Menu {

	public static void main() {
		System.out.println("================");
		System.out.println("本の登録は『1』");
		System.out.println("一覧の表示は『２』");
		System.out.println("貸出は『3』");
		System.out.println("返却は『4』");
		System.out.println("終了は『0』");
		System.out.println("================");
	}

	public static void list() {
		System.out.println("================");
		DataRetention.getList().sort(
				(book1, book2) -> book1.getId() - book2.getId());
		for (Book book : DataRetention.getList()) {
			System.out.println(book);
		}
		System.out.println("================");
		System.out.println("0:メインメニュー");
	}

	public static void creat() {
		System.out.println("================");
		System.out.println("タイトル->ジャンル");
		System.out.println("================");
	}

	public static void detail(int id) {
		System.out.println("================");
		BookDetail.detail(id);
	}

	public static void updata() {
		System.out.println("================");
		System.out.println("1:タイトル更新");
		System.out.println("2:ジャンル更新");
		System.out.println("0:メインメニュー");
		System.out.println("================");
	}

	public static void updata2() {
		System.out.println("================");
		System.out.println("1:本の更新");
		System.out.println("2:本の削除");
		System.out.println("0:メインメニュー");
		System.out.println("================");
	}

}
