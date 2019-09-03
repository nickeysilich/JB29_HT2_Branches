package by.htp.les03.main;
//35. Вычислить число и месяц в невисокосном году по номеру дня.

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {
		int n;
		int m = 1;
		int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер дня");
		n = sc.nextInt();

		while (n > days[-1 + m]) {
			n -= days[-1 + m++];
		}
		System.out.println(n + " число " + m + " месяц");

	}
}
