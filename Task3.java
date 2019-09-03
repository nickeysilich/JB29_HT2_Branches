package by.htp.les03.main;

import java.util.Scanner;

//3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».

public class Task3 {

	public static void main(String[] args) {
		int a;
		int b = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число а");
		a = sc.nextInt();
		if (a < 3) {
			System.out.println("yes");
		
		} else
			System.out.println("no");
	}

}
