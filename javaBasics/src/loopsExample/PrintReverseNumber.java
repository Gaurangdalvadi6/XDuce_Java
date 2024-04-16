package loopsExample;

//date 5/4/2024
public class PrintReverseNumber {

	public static void main(String[] args) {
		int n = 265;
		int mainNumber = n;
		int reverse = 0;
		int lastDigit = 0;

		while (n > 0) {
			lastDigit = n % 10;
			reverse = reverse * 10 + lastDigit;
			n = n / 10;
		}
		System.out.println(reverse);

	}

}
