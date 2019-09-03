package by.htp.les03.main;
//27. Найти max{min(a, b), min(c, d)}.

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		int a, b;
		int x, y;
		int c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextInt();
		System.out.println("Введите b");
		b = sc.nextInt();
		System.out.println("Введите c");
		c = sc.nextInt();
		System.out.println("Введите d");
		d = sc.nextInt();
		if ( a > b) {
			x = b;
		}
		else {
			x = a;
		} 
		if ( c > d) {
			y = d;
		}
		else {
			y = c;
		}
		if (x > y) {
			System.out.println("Max = " + x);
		}
		else {
			System.out.println("Max = " + y);
		}
}
}
