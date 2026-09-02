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
				Menu.list();
				switch (InputControl.inter("英数")) {
				case 0:
					break;

				default:
					Menu.detail(InputControl.inter("id"));
					break;
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
			case 0:
				System.out.println("終了します");
				l = false;
			default:
			}
		}
	}
}
