package collectionExample;
// 15/4/2024
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
	public static void main(String[] args) {
		Map<Integer, String> num = new HashMap<Integer,String>();
		
		num.put(9,"Gautam Chauhan");
		num.put(5,"Virendra Zala");
		num.put(15,"Harshil Patel");
		num.put(1,"Surendra Prajapati");
		num.put(6,"Jay Patel");
		
		
		System.out.println(num);
		
		for (Map.Entry<Integer,String> entry : num.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
