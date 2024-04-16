package ArrayExample;
// 9/4/2024
import java.util.Arrays;

public class ReverseArray {

	public static void reverseArray(int numbers[]) {
		int start = 0;
		int end = numbers.length-1;
		
		while (start<end) {
			int temp = numbers[end];
			numbers[end] = numbers[start];
			numbers[start] = temp;
			
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
	int numbers[] = {5,1,3,9,7};
	
	reverseArray(numbers);
	
	for (int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i] + " ");
	}
	System.out.println();
	
//	System.out.println(Arrays.toString(numbers));
}
}
