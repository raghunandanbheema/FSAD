package basics;

import java.util.Scanner;

public class TriangleChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter side a:");
		a = sc.nextInt();
		System.out.print("Enter side b:");
		b = sc.nextInt();
		System.out.print("Enter side c:");
		c = sc.nextInt();
		sc.close();
		if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}
 