package recursion_Example;
// 11/4/2024
public class FirstOccurrence {

	public static int firstOccurance(int number[],int key,int i) {
		if (i == number.length) {
			return -1;
		}
		if (number[i]==key) {
			return i;
		}
		return firstOccurance(number, key, i+1);
	}
	public static void main(String[] args) {
	int number[] = {2,5,6,4,3,8,5,1};
	int key = 4;
	System.out.println(firstOccurance(number, key, 0));
}
}