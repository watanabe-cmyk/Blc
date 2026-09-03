import input.InputControl;
import menu.Menu;
import model.BookControl;

public class Main {
	public static void main(String[] args) {
		boolean l = true;
		while (l) {
			Menu.main();
			switch (InputControl.inter("英数")) {
			case 1:
				Menu.creat();
				BookControl.creat();
				break;
			case 2:
				boolean listLoop = true;
				while (listLoop) {
					Menu.list();
					switch (InputControl.inter("英数")) {
					case 1:
						BookControl.sortKinds();
						break;
					case 2:
						Menu.detail(InputControl.inter("id"));
						break;
					case 0:
						listLoop = false;
						break;
					}
				}
				break;
			case 3:
				Menu.list();
				BookControl.lend();
				break;
			case 4:
				Menu.list();
				BookControl.returnbook();
				break;
			case 5:
				BookControl.search(InputControl.str("検索するタイトル"));
				break;
			case 0:
				System.out.println("終了します");
				l = false;
				break;
			default:
			}
		}
	}
}
