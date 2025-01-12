package recursion_Example;
// 11/4/2024
public class Fibonacci_Series {

	public static int fibonaciSeries(int n) {
		if (n==0||n==1) {
			return n;
		}
		return fibonaciSeries(n-1)+fibonaciSeries(n-2);
	}
	
	public static void main(String[] args) {
		fibonaciSeries(5);
		for (int i = 0; i <= 10; i++) {
			System.out.print(fibonaciSeries(i) + " ");
		}
		System.out.println();
	}
}
