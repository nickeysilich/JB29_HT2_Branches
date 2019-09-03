package by.htp.les03.main;
//16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		int x1;
		int y1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x1");
		x1 = sc.nextInt();
		System.out.println("Введите y1");
		y1 = sc.nextInt();
		if (x1 > 0 & y1 > 0) {
			System.out.println("part 1");
		}
			else if (x1 < 0 & y1 > 0) {
				System.out.println("part 2");
			}
			else if (x1 < 0 & y1 < 0) {
				System.out.println("part 3");
			}
			else if (x1 > 0 & y1 < 0) {
			System.out.println("part 4");
		}
		}
	}
