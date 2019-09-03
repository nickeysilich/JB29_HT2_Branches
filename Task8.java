package by.htp.les03.main;
//8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextInt();
		System.out.println("Введите b");
		b = sc.nextInt();
		int a1 = a * a;
		int b1 = b * b ;
		if (a1 > b1) {
			System.out.println("Квадрат b наименьший");
		}
		else {
			System.out.println("Квадрат a наименьший");
		}

	}

}
