package ArrayExample;
// 9/4/2024
public class PrintSubArray {
	public static void printSubArray(int numbers[]) {
		int totalPairs=0;
		for (int i = 0; i < numbers.length; i++) {
			int start = i;
			for (int j = i; j < numbers.length; j++) {
				//int sum = 0;
				int end = j;
				for (int k = start; k <= end; k++) {
					System.out.print(numbers[k] + " ");
					//sum = sum+numbers[k];
				}
				totalPairs++;
				System.out.println();
				//System.out.println("sum is : "+sum);
			}
			System.out.println();
		}
		System.out.println("Total Pairs : "+ totalPairs);
	}
public static void main(String[] args) {
	int numbers[] = {2,4,6,8,10};
	printSubArray(numbers);
}
}
