package by.htp.les03.main;

import java.util.Scanner;

//5. Составить программу: определения наименьшего из двух чисел а и b.

public class Task5 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		if (a < b) {
			System.out.println("A меньше B");
		}
		if (a == b) {
			System.out.println("A равно B");
		}
		else 
			System.out.println("B меньше А");
		}
	}