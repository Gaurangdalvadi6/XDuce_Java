package arrayList_Example;

import java.util.ArrayList;
import java.util.Collections;
// 12/4/2024
public class Arraylist_Sort {

	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<Integer>();
		ll.add(2);
		ll.add(9);
		ll.add(7);
		ll.add(8);
		ll.add(10);
		ll.add(1);
		
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);		
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println(ll);
}
}
