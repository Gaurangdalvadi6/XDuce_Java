package recursion_Example;
// 11/4/2024
public class First_N_Natural_Number_Sum {

	public static int NaturalNumberSum(int n) {
		if (n==1) {
			return n;
		}
		return n+NaturalNumberSum(n-1);
	}
	public static void main(String[] args) {
	System.out.println(NaturalNumberSum(10));
}
}
