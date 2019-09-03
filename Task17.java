package by.htp.les03.main;
//17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		int t;
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число t");
		t = sc.nextInt();
		System.out.println("Введите число p");
		p = sc.nextInt();
		
		if (t > p){
			t = t;
			p = t;
			System.out.println("t= "+ t);
			System.out.println("p= "+ p);
		}
		else if (p > t) {
			p = p;
			t = p;
			System.out.println("t= " + t);
			System.out.println("p= "+ p);
		}
		else if (t == p) {
			t = 0;
			p = 0;
			System.out.println("t= " + t);
			System.out.println("p= "+ p);
		}
	}
}
