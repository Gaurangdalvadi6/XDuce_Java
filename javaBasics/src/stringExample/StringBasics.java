package stringExample;
// 9/4/2024
import java.util.Scanner;

public class StringBasics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = "gaurang dalvadi   ";
		System.out.println(str);
		System.out.println(str.trim()); // remove the space before and after letter it cannot remove sentence between word
		System.out.println(str.length()); // give the length
		System.out.println(str.charAt(0)); // give the value at that index
		System.out.println(str.toLowerCase()); // give the lowercase string
		System.out.println(str.toUpperCase()); // give the uppercase string
		System.out.println(str.endsWith("ng")); // check the endwith that string or character
		System.out.println(str.concat(" dalvadi")); // concat mate but can't change original string
		System.out.println(str.indexOf("r")); // give the index of character or string
		System.out.println(str.contains("u")); // check the string has that contain
		System.out.println(str.isEmpty()); // check the is Empty
		System.out.println(str.lastIndexOf("ng")); // get the index of that character or string

	}
}
