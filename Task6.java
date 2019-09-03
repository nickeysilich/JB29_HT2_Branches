package by.htp.les03.main;
//6. Составить программу: определения наибольшего из двух чисел а и b.

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println("A больше B");
		}
		if (a == b) {
			System.out.println("A равно B");
		}
		else 
			System.out.println("B больше А");
		}
	}