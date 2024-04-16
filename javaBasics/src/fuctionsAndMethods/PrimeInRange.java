package fuctionsAndMethods;
// 8/4/2024
public class PrimeInRange {
	public static void primeRange(int n) {
		for (int i = 2; i <= n; i++) {
			if (PrimeOrNot.isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
public static void main(String[] args) {
	primeRange(100);
}
}
