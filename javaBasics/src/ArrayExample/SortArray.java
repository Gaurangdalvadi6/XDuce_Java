package ArrayExample;
// 9/4/2024
import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void printArr(Integer numbers[]) {
		for (Integer number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
	
public static void main(String[] args) {
	Integer numbers[]= {50,44,11,33,21};
	Arrays.sort(numbers,Collections.reverseOrder());	
	printArr(numbers);
	
	
	
	
}
}
