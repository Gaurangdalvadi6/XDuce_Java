package arrayList_Example;
// 12/4/2024
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Find_Max {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(2);
	al.add(9);
	al.add(7);
	al.add(8);
	al.add(10);
	al.add(1);
	
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < al.size(); i++) {
//		if (max<al.get(i)) {
//			max = al.get(i);
//		}
		max = Math.max(max, al.get(i));
	}
	System.out.println("max : " + max);
	
//	int max = Collections.max(al);
//	System.out.println("max : " + max);
}
}