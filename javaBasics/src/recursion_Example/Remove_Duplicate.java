package recursion_Example;
// 11/4/2024
public class Remove_Duplicate {
	public static void removeDuplicate(String str,int index,StringBuilder newStr,boolean map[]) {
		if (index == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		// kaam
		char currChar = str.charAt(index);
		if (map[currChar-'a'] == true) {
			// duplicate
			removeDuplicate(str, index+1, newStr, map);
		}
		else {
			map[currChar-'a']= true;
			removeDuplicate(str, index+1, newStr.append(currChar), map);
		}
	}
public static void main(String[] args) {
	String str ="apnaghar";
	removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
}
}
