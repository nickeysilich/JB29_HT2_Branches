package by.htp.les03.main;
//7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число с");
		c = sc.nextInt();
		System.out.println("Введите число x");
		x = sc.nextInt();
		y = a * x * x + b * x + c;
		System.out.println(Math.abs(y));
		
	}

}
