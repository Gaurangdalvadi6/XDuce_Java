package fuctionsAndMethods;
// 8/4/2024
import java.util.Scanner;

public class FindProduct {
	public static int product(int a, int b) {
		int multiply = a * b;
		return multiply;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of B : ");
		int b = sc.nextInt();
		int x = product(a, b);
		System.out.println("Product of a and b is : " + x);
	}
}
