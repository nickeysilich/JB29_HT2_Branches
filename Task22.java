package by.htp.les03.main;
//22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		int x;
		int y;
		int x1, y1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		x = sc.nextInt();
		System.out.println("Введите y");
		y = sc.nextInt();
		if (x > y) {
			x1 = x ;
			y1 = y;
			System.out.println("X = " + x1);
			System.out.println("Y = " + y1);
		}
		else if (x < y) {
			x1 = y;
			y1 = x;
			System.out.println( "X = " + x1);
			System.out.println("Y = " + y1);
		}
		else {
			System.out.println( "X = Y" );
		}
	}

}
