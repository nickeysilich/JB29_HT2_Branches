package by.htp.les03.main;
//23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		int m;
		int d;
		int y;
		Scanner sc;

		sc = new Scanner(System.in);
		System.out.println("Введите число");
		d = sc.nextInt();
		System.out.println("Введите месяц");
		m = sc.nextInt();
		System.out.println("Введите год");
		y = sc.nextInt();

		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (d >= 1 && d <= 31) {
				System.out.println("Date is correct");
			} else {
				System.out.println("Date is not correct");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (d >= 1 && d <= 30) {
				System.out.println("Date is correct");
			} else {
				System.out.println("Date is not correct");
			}
			break;
		case 2:
			if (y % 4 == 0 && y % 100 == 0 && y % 400 == 0 && d >= 1 && d <= 29) {
				System.out.println("Date is correct");
			} else if (d >= 1 && d <= 28) {
				System.out.println("Date is correct");
			} else {
				System.out.println("Date is not correct");
			}
			break;

		}

	}
}
