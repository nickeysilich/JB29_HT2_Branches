package by.htp.les03.main;
//24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков п.

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		int l;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество лепестков");
		l = sc.nextInt();
		if (l % 2 == 0 ) {
			System.out.println("Не любит");
		}else 
		{
			System.out.println("Любит");
		}

	}

}
