package by.htp.les03.main;
//26. Написать программу нахождения суммы большего и меньшего из трех чисел.

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		Scanner sc;
		
		  int a;
		  int b;
		  int c;
		  int s;
		  
		  sc = new Scanner(System.in);
		  System.out.println("Введите первое число");
		  a = sc.nextInt();
		  System.out.println("Введите второе число");
		  b = sc.nextInt();
		  System.out.println("Введите третье число");
		  c = sc.nextInt();
		  s = 0;
		  
		  if (a > b & a > c & c < b) {
		   s = a + c;
		   System.out.println(s);
		  }
		  else if (a > b & a > c & b < c) {
		   s = a + b;
		   System.out.println(s);
		  }
		  else if (b > a & b > c & a < c) {
		   s = b + a;
		   System.out.println(s);
		  }
		  else if (b > a & b > c & c < a) {
		   s = b + c;
		   System.out.println(s);
		  }
		  else if (c > a & c > b & b < a) {
		   s = c + b;
		   System.out.println(s);
		  }
		  else if (c > a & c > b & a < b) {
		   s = c + a;
		   System.out.println(s);
		  }

	}

}
