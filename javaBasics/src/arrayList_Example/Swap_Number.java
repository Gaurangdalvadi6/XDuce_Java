package arrayList_Example;
// 12/4/2024
import java.util.ArrayList;

public class Swap_Number {
	public static void swapping(ArrayList<Integer> al,int idx1,int idx2) {
		int temp = al.get(idx1);
		al.set(idx1, al.get(idx2));
		al.set(idx2, temp);
	}
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(2);
	al.add(9);
	al.add(7);
	al.add(8);
	al.add(1);
	int idx1 = 1,idx2=3;
	
	System.out.println(al);
	
	swapping(al, idx1, idx2);
	System.out.println(al);
}
}
