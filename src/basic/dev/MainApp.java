package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.println("Nhap a: ");
		a = sc.nextDouble();
		System.out.println("Nhap b: ");
		b = sc.nextDouble();
		System.out.println("Nhap c: ");
		c = sc.nextDouble();
		
		delta = b * b - 4 * a * c;
		
		if (a == 0) {
			System.out.println("Nhap a sai. Nhap lai!");
		}else {
			if (delta < 0) {
				System.out.println("Phuong trinh vo ngiem");
			}else if (delta == 0) {
				x1 = - b / 2 * a;
				System.out.println("Phuong trinh co nghiem kep x1 = x2: " + (x1));
			}else if (delta > 0) {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}

}
