package by.htp.les03.main;
//13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		int x1;
		int y1;
		int x2;
		int y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x1");
		x1 = sc.nextInt();
		System.out.println("Введите y1");
		y1 = sc.nextInt();
		System.out.println("Введите x2");
		x2 = sc.nextInt();
		System.out.println("Введите y2");
		y2 = sc.nextInt();
		if ((Math.sqrt(x1*x1 + y1*y1)) < (Math.sqrt(x2*x2 + y2*y2)))
				{ System.out.println("первая точка ближе");
			
		} else {
			System.out.println("вторая точка ближе");
		}
	}
}
