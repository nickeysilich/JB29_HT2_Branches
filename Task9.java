package by.htp.les03.main;
//9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число с");
		c = sc.nextInt();
		if (a == b & b == c & a ==c) {
			System.out.println("Треугольник равносторонний");
		}
		else 
			System.out.println("Треугольник не равносторонний");
		}
	}

