package by.htp.les03.main;
//11. Составить программу, которая определит площадь какого треугольника больше.

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		int S1;
		int S2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите площадь первого треугольника");
		S1 = sc.nextInt();
		System.out.println("Введите площадь второго треугольника");
		S2 = sc.nextInt();
		if (S1 > S2) {
			System.out.println("Площадь первого треугольника больше");
			
		}  if (S2 == S1) {
			System.out.println("Площади треугольников равны ");
		}
		else {
			System.out.println("Площадь второго треугольника больше");
		}
	}
	}

