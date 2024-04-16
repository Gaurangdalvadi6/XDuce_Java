package loopsExample;

import java.util.Scanner;
//date 5/4/2024
public class PrimeOrNot {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value : ");
		int n = sc.nextInt();
		if (n == 2) {
			System.out.println("it is prime number");
		} else {
			boolean isPrime = true;
			for (int i = 2; i <=Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				System.out.println("it is prime number");
			} else {
				System.out.println("it is not prime number");
			}
		}

		
	}
}
