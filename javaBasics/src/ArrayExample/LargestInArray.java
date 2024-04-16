package ArrayExample;
// 8/4/2024 
import java.util.Arrays;
import java.util.OptionalInt;

public class LargestInArray {
	public static int getLargest(int numbers[]) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
			if (smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println("Smallest : " + smallest);
		return largest;

	}

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 6, 3, 5 };
		int max = getLargest(numbers);

		System.out.println("Largest is : " + max);
		
//		int max2 = Arrays.stream(numbers).max().getAsInt();
//		System.out.println(max2);
	}
}
