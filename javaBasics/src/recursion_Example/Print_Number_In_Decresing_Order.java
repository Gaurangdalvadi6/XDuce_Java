package recursion_Example;
// 11/4/2024
public class Print_Number_In_Decresing_Order {
	public static void printNumberDecreaseOrder(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		} else {
			System.out.print(n + " ");
			printNumberDecreaseOrder(n - 1);
		}
	}
	
	public static void printNumberIncreaseOrder(int n) {
		if (n == 1) {
			System.out.print(n +" ");
			return;
		} else {
			printNumberIncreaseOrder(n-1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		int n = 10;
		printNumberDecreaseOrder(n);
		printNumberIncreaseOrder(n);
	}
}
