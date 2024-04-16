package ArrayExample;
// 8/4/2024 
import java.util.Arrays;

public class arrayBasics {
	public static void update(int marks[]) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = marks[i] + 1;
		}
	}
	
	public static void main(String[] args) {
		//int marks[] = new int[50];
		int numbers[] = { 1, 2, 3 };
//	System.out.println(marks.length);
		String fruits[] = { "Apple", "Banana", "Pine Apple" };
		
		int marks[] = {96,99,97};
		update(marks);
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] +" " );
		}
		System.out.println();
		
//	System.out.println(Arrays.toString(fruits));

//	for (int i = 0; i < fruits.length; i++) {
//		System.out.println(fruits[i]);
//	}

//	System.out.println(Arrays.asList(fruits));

//	for (String f : fruits) {
//		System.out.println(f);		
//	}

		
	}
}
