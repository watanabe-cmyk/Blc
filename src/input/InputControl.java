package input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputControl {
	private static Scanner scan = new Scanner(System.in);

	public static int inter(String a) {
		System.out.println(a + "を入力してください");
		while (true) {
			try {
				return scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(a + "を入力してください");
				scan.nextLine();
			}
		}
	}

	public static String str(String a) {
		System.out.println(a + "を入力してください");
		while (true) {
			try {
				return scan.next();
			} catch (InputMismatchException e) {
				System.out.println(a + "を入力してください");
				scan.nextLine();
			}
		}
	}

}
