package by.htp.les03.main;
//19. Подсчитать количество положительных среди чисел а, b, с. & b < 0 & c < 0)

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextInt();
		System.out.println("Введите b");
		b = sc.nextInt();
		System.out.println("Введите c");
		c = sc.nextInt();
		if (a > 0)  {
			x = x + 1;
		}
		if (b > 0) {
			x = x + 1;	
		}
		if (c > 0) {
			x = x + 1;
			System.out.println("Количество положительных чисел= " + x);
		}
	else {
		System.out.println("Количество положительных чисел= 0");
		
	}

	}}