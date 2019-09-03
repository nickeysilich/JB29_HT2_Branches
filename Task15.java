package by.htp.les03.main;
//15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Double x;
		Double y;
		Double x1;
		Double y1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число x");
		x = sc.nextDouble();
		System.out.println("Введите число y");
		y = sc.nextDouble();
		if (x < y) {
			x1= (x + y) / 2;
			y1 = (x * y) * 2;
			System.out.println(x1);
			System.out.println(y1); 
			}
		else if (y < x) {
		y1 = (x + y) / 2;
		x1 = (x * y) * 2;
		System.out.println(y1);
		System.out.println(x1);
		}
		else {
			System.out.println("x и y равны");
		}
		}
}
	

