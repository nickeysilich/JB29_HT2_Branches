package by.htp.les03.main;
//10. Составить программу, которая определит площадь какого круга меньше.

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int S1;
		int S2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите площадь первого круга");
		S1 = sc.nextInt();
		System.out.println("Введите площадь второго круга");
		S2 = sc.nextInt();
		if (S1 > S2) {
			System.out.println("Площадь второго круга меньше");
			
		}  if (S2 == S1) {
			System.out.println("Площади кругов равны ");
		}
		else {
			System.out.println("Площадь первого круга меньше");
		}
	}

}
