package fuctionsAndMethods;
// 8/4/2024
import java.util.Scanner;

public class Find_Factorial {

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact= fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = factorial(new Scanner(System.in).nextInt());
		System.out.println(a);
	}
}
