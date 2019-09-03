package by.htp.les03.main;

import java.util.Scanner;

//31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
public class Task31 {

	public static void main(String[] args) {
		int A;
		int B;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите высоту А");
		A = sc.nextInt();
		System.out.println("Введите ширину Б");
		B = sc.nextInt();
		int x, y, z;
		System.out.println("Введите длинну x");
		x = sc.nextInt();
		System.out.println("Введите ширину y");
		y = sc.nextInt();
		System.out.println("Введите высоту z");
		z = sc.nextInt();
		 if (x < A && y < B ) {
			 System.out.println("Пройдет");
		 }
		 else if (y < A && x < B ) {
			 System.out.println("Пройдет");
		 }
		 else if (x < A && z < B ) {
			 System.out.println("Пройдет");
		 }
		 else if (z < A && x < B ) {
			 System.out.println("Пройдет");
		 }
		 else if (y < A && z < B ) {
			 System.out.println("Пройдет");
		 }
		 else if (z < A && y < B ) {
			 System.out.println("Пройдет");
		 }
		 else {
			 System.out.println("Не пройдет");
		 }
	}
}
