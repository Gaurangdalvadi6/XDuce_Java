package collectionExample;
// 15/4/2024
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<Integer>();
	list.add(5);
	list.add(15);
	list.add(2);
	list.add(13);
	list.add(9);
	
	System.out.println(list);
	
	Iterator<Integer> it = list.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	
//	list.add(21);
//	System.out.println(list);
//	
//	list.add(1, 66);
//	System.out.println(list);
//	//System.out.println(list.get(5));
//	list.remove(0);    // index pass karvani
//	System.out.println(list);
//	
//	list.remove(Integer.valueOf(66));
//	System.out.println(list);
//	
//	list.set(1, 96);
//	System.out.println(list);
	
//	List<Integer> alist = new ArrayList<Integer>();
//	alist.add(98);
//	alist.add(78);
//	
//	System.out.println("alist "+ alist);
//	
//	list.addAll(alist);
//	list.clear();
//	System.out.println(list);
	
	
	}
}
