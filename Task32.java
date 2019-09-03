package by.htp.les03.main;
//32. Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.

import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		x = sc.nextInt();
		System.out.println("Введите y");
		y = sc.nextInt();
		System.out.println("Введите z");
		z = sc.nextInt();
		int x1 = x + y;
		int x2 = x + z;
		int x3 = z + y;
	
		if (x2 > 0) {
			System.out.println("Сумма положительная и равна = " + x2);	
		}
		if (x3 > 0) {
			System.out.println("Сумма положительная и равна = " + x3);
		}
		if (x1 > 0) {
			
			System.out.println("Сумма положительная и равна = " + x1);
		}
		else {
			System.out.println("Сумма ни одной из пар не является положительной");
		}
			
		
	}

}
