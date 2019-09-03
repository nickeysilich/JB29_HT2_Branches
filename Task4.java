package by.htp.les03.main;
//4. Составить программу: равны ли два числа а и b?

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		if (a == b) {
			System.out.println("a и b равны");
	} else 
		System.out.println("a и b не равны");

}
}