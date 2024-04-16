package fuctionsAndMethods;
// 8/4/2024
public class DecimalToBinary {

	public static void decimalToBinary(int s) {
		int mainNmr = s;
		int power = 0;
		int lastDigit;
		int binaryNumber=0;
		while (s > 0) {
			lastDigit = s % 2;
			binaryNumber = (int) (binaryNumber + (lastDigit * Math.pow(10, power)));
			s = s / 2;
			power++;
		}
		System.out.println("binary form of " + mainNmr + " = "+ binaryNumber);
	}

	public static void main(String[] args) {
		decimalToBinary(7);
	}
}
