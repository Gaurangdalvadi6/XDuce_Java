package javaBasics;

import java.util.Scanner;

public class Switch_Case_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter value of b: ");
		int b = sc.nextInt();
		System.out.println("sum");
		System.out.println("sub");
		System.out.println("mul");
		System.out.println("div");
		System.out.println("modulo");
		System.out.println("Enter any operator: ");
		String c = sc.next();

		switch (c) {
		case "sum": {
			System.out.println("sum is : " + (a + b));
			break;
		}
		case "sub": {
			System.out.println("sub is : " + (a - b));
			break;
		}
		case "mul": {
			System.out.println("multiply is : " + (a * b));
			break;
		}
		case "div": {
			System.out.println("division is : " + (a / b));
			break;
		}
		case "modulo": {
			System.out.println("modulo is : " + (a % b));
			break;
		}
		default:
			System.out.println("Please Enter Valid Input.");
		}
	}
}
