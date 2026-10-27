package sample;

import java.util.Scanner;

public class Arthmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for A");
		int a = sc.nextInt();
		System.out.println("Enter a number for B");
		int b = sc.nextInt();
		System.out.println("a+b is: "+(a+b));
		System.out.println("a-b is: "+(a-b));
		System.out.println("a*b is: "+(a*b));
		System.out.println("a%b is: "+(a%b));
		System.out.println("a/b is: "+(a/b));
		sc.close();
	}
}
