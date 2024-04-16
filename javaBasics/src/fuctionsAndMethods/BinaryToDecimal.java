package fuctionsAndMethods;
// 8/4/2024 
public class BinaryToDecimal {
	public static void binaryToDecimal(int n) {
		int lastDigit;
		int mainNumber = n;
		int power = 0;
		int decimal = 0;
		while (n > 0) {
			lastDigit = n % 10;
			decimal = (int) (decimal + (lastDigit * Math.pow(2, power)));
			n = n / 10;
			power++;
		}
		System.out.println("decimal form of " + mainNumber + " = " + decimal);
	}

	public static void main(String[] args) {
		binaryToDecimal(1010);
	}
}
