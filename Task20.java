package by.htp.les03.main;
//20. Определить, делителем каких чисел а, b, с является число k.

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int k = 6;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextInt();
		System.out.println("Введите b");
		b = sc.nextInt();
		System.out.println("Введите c");
		c = sc.nextInt();
		if (a % k ==0) { 
			System.out.println("K является делителем числа A");}
		
		if (b % k ==0) { 
			System.out.println("K является делителем числа B");}
		if (c % k ==0 ) {
			System.out.println("K является делителем числа C");
		}
		else if (a % k != 0 & b % k != 0 & c % k != 0){
			System.out.println("K не является делителем ни для одного числа");
		}

	}

}
