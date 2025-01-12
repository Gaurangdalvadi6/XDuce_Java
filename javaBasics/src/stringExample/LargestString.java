package stringExample;

public class LargestString {
public static void main(String[] args) {
	String fruits[] = {"apple","mango","banana","zabun"};
	// compareTo and compareToIgnoreCase Follows lexicographically order
//	 str1.compareToIgnoreCase(str2) str1<str2 returns -1
//	 str1.compareToIgnoreCase(str2) str1>str2 returns +1
//	 str1.compareToIgnoreCase(str2) str1==str2 returns 0
	
	String largest = fruits[0];
	for (int i = 0; i < fruits.length; i++) {
		if (largest.compareToIgnoreCase(fruits[i])<0) {
			largest = fruits[i];
		}
	}
	System.out.println(largest);
}
}
