package javaBasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2,9,6,4,3,10);
		
		Stream<Integer> s = nums.stream();
		Stream<Integer> s1 = s.filter(n -> n%2 == 0);
//		s1.forEach(n -> System.out.println(n));
//		Stream<Integer> s2 = s1.map(n -> n*2);
//		int result = s2.reduce(0,(c,e) -> c+e);
//		System.out.println(result);
		
//		Stream<Integer> sortedvalue = nums.stream()
//						.filter(n -> n%2 ==0)
//						.sorted();
//	
//		sortedvalue.forEach(n -> System.out.println(n));
		
//		System.out.println(result);
		
		//s2.forEach(n -> System.out.println(n));
		
		
//		int sum=0;
//		for (int n : nums) {
//			if (n%2 == 0) {
//				n = n*2;
//				sum+=n;
//			}
//		}
//		System.out.println(sum);
		
//		for (int i = 0; i < nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}
		
		//nums.forEach(n -> System.out.println(n));
	}
}
