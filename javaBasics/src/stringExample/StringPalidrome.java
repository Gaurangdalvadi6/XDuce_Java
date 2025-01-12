package stringExample;
// 9/4/2024
public class StringPalidrome {
	public static boolean isPalidrome(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			int n = str.length();
			if (str.charAt(i)!=str.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "noon";
		if (isPalidrome(str)) {
			System.out.println("it is palidrome.");
		}
		else {
			System.out.println("it is not palidrome.");
		}
		isPalidrome(str);
	}
}
