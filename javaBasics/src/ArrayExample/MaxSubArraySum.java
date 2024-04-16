package ArrayExample;
// 9/4/2024
public class MaxSubArraySum {

	public static void printMaxSubArraySum(int numbers[]) {
//		brute Force
		
//		int currsum = 0;
//		int maxSum = Integer.MIN_VALUE;
//		for (int i = 0; i < numbers.length; i++) {
//			int start = i;
//			for (int j = i; j < numbers.length; j++) {
//				currsum = 0;
//				int end = j;
//				for (int k = start; k <= end; k++) {
//					currsum = currsum+numbers[k];
//				}
//				System.out.println("sum is : "+currsum);
//				if (maxSum<currsum) {
//					maxSum= currsum;
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("Max Sum is : " + maxSum);
		
		int currsum = 0;
		int maxSum = Integer.MIN_VALUE;
		int prefix[] = new int[numbers.length];
		
		prefix[0] = numbers[0];
		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i-1]+numbers[i];
		}
		
		for (int i = 0; i < numbers.length; i++) {
			int start = i;
			for (int j = i; j < numbers.length; j++) {
				int end = j;
				
				currsum = (start==0)?prefix[end]:prefix[end]-prefix[start-1];
				
				if (maxSum<currsum) {
					maxSum = currsum;
				}
			}
		}
		System.out.println("Max Sum is : " + maxSum);
	}
	public static void main(String[] args) {
	int numbers[] = {1,-2,6,-1,3};
	printMaxSubArraySum(numbers);
}
}
