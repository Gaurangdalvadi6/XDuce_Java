package stringExample;
//	10/4/2024
public class StringCompare {
public static void main(String[] args) {
	String str = "Gaurang";
	String str1 = "Gaurang";
	String str2 = new String("Gaurang");
	
//	note
//	== are check the address of variable
//	.equals() are check the value of variable	
	
//	if (str==str1) {
//		System.out.println("String are equal");
//	} else {
//		System.out.println("String are not equal");
//	}
//	
//	if (str==str2) {
//		System.out.println("String are equal");
//	} else {
//		System.out.println("String are not equal");
//	}
	
	if (str.equals(str2)) {
		System.out.println("String are equal");
	} else {
		System.out.println("String are not equal");
	}
}
}
