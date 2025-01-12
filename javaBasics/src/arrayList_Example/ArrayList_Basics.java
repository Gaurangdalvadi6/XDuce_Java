package arrayList_Example;
// array have fixed size where arraylist have dynamic size
// array work with primitive data types as well as objects where arraylist use with object

import java.util.ArrayList;
// 12/4/2024
public class ArrayList_Basics {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> slist = new ArrayList<String>();
		
		list.add(1);    //time O(1)
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		//System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		System.out.println();
//		list.add(2, 25);  //time O(n)
//		System.out.println(list);
		
		//get 
//		int element = list.get(3);   //time O(1)
//		System.out.println(element);
		
		// remove or delete 
//		list.remove(2);     //time O(n)
//		System.out.println(list);
		
		// set 
//		list.set(1, 25);  //time O(n)
//		System.out.println(list);
		
		// contains
//		System.out.println(list.contains(10));   //time O(n)
//		System.out.println(list.contains(4));
	}
}
