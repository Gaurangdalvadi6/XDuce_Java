package ArrayExample;
// 8/4/2024 
public class LinearSearch {
	public static int linearSearch(int numbers[],int key) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int numbers[] = {2,4,6,8,10,12,14,16};
	int key = 14;
	
	int index = linearSearch(numbers, key);
	if (index == -1) {
		System.out.println("key is not found");
	} else {
		System.out.println("Key is at index : " + index);
	}
}
}
