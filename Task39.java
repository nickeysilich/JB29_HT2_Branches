package by.htp.les03.main;
//38. Вычислить значение функции:

import java.util.Scanner;

public class Task39 {

	public static void main(String[] args) {
		double x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		x = sc.nextDouble();
		if (x >= 8) {
			double f1 = -Math.pow(x, 2) + x - 9;
			System.out.println("Значение функции= " + f1);
		}
		else if (x < 8) {
			double f2 = 1 / (Math.pow(x, 4) - 6);
			System.out.println("Значение функции= " + f2);
		}

	}

}
