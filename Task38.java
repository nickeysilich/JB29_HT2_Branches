package by.htp.les03.main;
//38. Вычислить значение функции:

import java.util.Scanner;

public class Task38 {

	public static void main(String[] args) {
		double x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		x = sc.nextDouble();
		if (0 <= x && x <= 3) {
			double f1 = Math.pow(x, 2);
			System.out.println("Значение функции= " + f1);
		}
		else if (x > 3 | x < 0) {
			double f2 = 4;
			System.out.println("Значение функции= " + f2);
		}
		}
}
