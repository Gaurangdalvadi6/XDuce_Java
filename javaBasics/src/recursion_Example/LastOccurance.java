package recursion_Example;
// 11/4/2024
public class LastOccurance {

	public static int lastOccurance(int arr[],int key,int i) {
		if (i==arr.length) {
			return -1;
		}
		int isFound = lastOccurance(arr, key, i+1);
		
		if (isFound != -1) {
			return isFound;
		}
		
		//check with self
		if (arr[i]==key) {
			return i;
		}
		return isFound;
	}
	public static void main(String[] args) {
	int arr[]= {2,5,6,4,3,8,5,1};
	System.out.println(lastOccurance(arr, 4, 0));
}
}
