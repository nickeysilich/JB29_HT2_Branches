package by.htp.les03.main;
//37. Вычислить значение функции:

import java.util.Scanner;

public class Task37 {

	public static void main(String[] args) {
		double x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		x = sc.nextDouble();
		if (x <= 3) {
			double f1 = -Math.pow(x, 2) + 3 * x + 9;
			System.out.println("Значение функции= " + f1);
		}
		else if (x > 3) {
			double f2 = 1 / (Math.pow(x, 3) - 6);
			System.out.println("Значение функции= " + f2);
		}
		}
	}
