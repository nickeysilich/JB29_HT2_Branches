package by.htp.les03.main;
//12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double x, y, x1, y1, z, z1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число с");
		c = sc.nextInt();
		if (a > 0 ) {
			x = a * a;
			System.out.println(x );
		}
		else {x1 = Math.pow(a, 4);
		System.out.println(x1 );	
		}
		if (b > 0) {
			y = b* b;
			System.out.println(y);
		}
		else {
			
			y1 = Math.pow(b, 4);
			
			System.out.println(y1);
		}
		if (c > 0 ) {
			z = c * c;
			System.out.println(z);
		}
		else {z1 = Math.pow(c, 4);
		System.out.println(z1);	
		}
	}
}
