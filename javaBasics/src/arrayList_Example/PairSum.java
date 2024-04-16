package arrayList_Example;
// 12/4/2024
import java.util.ArrayList;

public class PairSum {
	public static boolean pairSum(ArrayList<Integer> list, int target) {
		int lp = 0;
		int rp = list.size() - 1;

		while (lp != rp) {
			// case 1
			if (list.get(lp) + list.get(rp) == target) {
				return true;
			}

			// case 2
			if (list.get(lp) + list.get(rp) < target) {
				lp++;
			} else {
				rp--;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		int target = 10;
		
		System.out.println(pairSum(list, target));
	}
}