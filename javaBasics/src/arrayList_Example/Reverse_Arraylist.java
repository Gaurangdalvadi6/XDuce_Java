package arrayList_Example;
// 12/4/2024
import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Arraylist {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(2);
	al.add(9);
	al.add(7);
	al.add(8);
	al.add(1);
	
	System.out.println(al);
	
	for (int i = al.size()-1; i >= 0; i--) {
		System.out.print(al.get(i)+ " ");
	}
	System.out.println();
	
//	Collections.reverse(al);
//	System.out.println(al);
}
}
