package by.htp.les03.main;

import java.util.Scanner;

//29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task29 {

	public static void main(String[] args) {
		int x1, y1, x2, y2, x3, y3;
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x1");
		x1 = sc.nextInt();
		System.out.println("Введите y1");
		y1 = sc.nextInt();
		System.out.println("Введите x2");
		x2 = sc.nextInt();
		System.out.println("Введите y2");
		y2 = sc.nextInt();
		System.out.println("Введите x3");
		x3 = sc.nextInt();
		System.out.println("Введите y3");
		y3 = sc.nextInt();
	
		a = (y2 - y1) / (x2 - x1);
		b = y1 - (a * x1);
		int z3 = a * x3 + b;
		if (z3 == y3) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежать на одной прямой");
		}
	}

}
