package arrayList_Example;
// 12/4/2024
import java.util.ArrayList;

public class Multi_Dimensional_ArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mainlList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();

		for (int i = 1; i <= 5; i++) {
			list1.add(i * 1);
			list2.add(i * 2);
			list3.add(i * 3);
		}

		mainlList.add(list1);
		mainlList.add(list2);
		mainlList.add(list3);

		System.out.println(mainlList);
		
		for (int i = 0; i < mainlList.size(); i++) {
			//ArrayList<Integer> currList = mainlList.get(i);
			for (int j = 0; j < mainlList.get(i).size(); j++) {
				System.out.print(mainlList.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
