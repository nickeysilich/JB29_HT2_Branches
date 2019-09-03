package by.htp.les03.main;
//25. Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С.

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите температуру комнаты");
		t = sc.nextInt();
		if (t > 60) {
			System.out.println("Пожароопасная ситуация!!!1!");
		}
		else {
			System.out.println("Температура помещения соответсвует нормам");
		}
	}

}
