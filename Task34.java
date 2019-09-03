package by.htp.les03.main;
//34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите стоимость книги");
		a = sc.nextDouble();
		System.out.println("Введите сумму оплаты");
		b = sc.nextDouble();
		double c = a - b;
		if (c == 0) {
			System.out.println("спасибо");}
			else if (c > 0) {
				System.out.println("Средств недостаточно= " + c);
			}
			else if (c < 0) {
				System.out.println("Возьмите сдачу " + Math.abs(c));
			}
			
		}
	}

