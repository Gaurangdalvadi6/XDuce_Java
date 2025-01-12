package ArrayExample;
// 9/4/2024
public class PrintPair {

	public static void printPair(int numbers[]) {
		int totalPairs = 0;
		for (int i = 0; i < numbers.length; i++) {
			int curr = numbers[i];
			for (int j = i+1; j < numbers.length; j++) {
				System.out.print("("+curr+","+numbers[j]+")");
				totalPairs++;
			}
			System.out.println();
		}
		System.out.println("TotalPairs : "+ totalPairs);
	}

	public static void main(String[] args) {
		int numbers[] = {2,4,6,8,10};
		printPair(numbers);
	}
}
