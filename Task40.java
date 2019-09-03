package by.htp.les03.main;
//40. Вычислить значение функции:

import java.util.Scanner;

public class Task40 {

	public static void main(String[] args) {
		double x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		x = sc.nextDouble();
		if (x <= 13) {
			double f1 = -Math.pow(x, 3) + 9;
			System.out.println("Значение функции= " + f1);
		}
		else if (x > 13) {
			double f2 = - (3 / (x + 1));
			System.out.println("Значение функции= " + f2);
	}
}
}
