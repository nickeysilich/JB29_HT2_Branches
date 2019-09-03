package by.htp.les03.main;
//30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.

import java.util.Scanner;
import static java.lang.Math.abs;

public class Task30 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextInt();
		System.out.println("Введите b");
		b = sc.nextInt();
		System.out.println("Введите c");
		c = sc.nextInt();
		if (a > b && b > c) {
			a = a * a;
			b = b * b;
			c = c * c;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else {
			a = abs(a);
			b = abs(b);
			c = abs(c);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}

}
