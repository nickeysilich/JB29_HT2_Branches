package by.htp.les03.main;
//14. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		int alfa;
		int beta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите alfa");
		alfa = sc.nextInt();
		System.out.println("Введите beta");
		beta = sc.nextInt();
		if (180 - (alfa + beta) == 90) {
			System.out.println("прямоугольный");
		}
		else if (180 - (alfa + beta) > 0) {
			System.out.println("существует");
		}
		else 
		{
			System.out.println("не существует");
		}
	}
}
