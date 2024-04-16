package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelStreamExample {
public static void main(String[] args) {
	int size = 10_00;
	List<Integer> list = new ArrayList<Integer>(size);
	
	Random ran = new Random();

	for (int i = 1; i <= size; i++) {
		list.add(ran.nextInt(100));
	}
	
//	int sum1 = list.stream()
//			.map(n -> n*2)
//			.reduce(0, (c,e) -> c+e);
	
	long  startSeq = System.currentTimeMillis();
	int sum2 = list.stream()
					.map(n ->{ 
					try {
						Thread.sleep(1);
					} catch (Exception e) {}
					return n*2;
					})
					.mapToInt(n -> n)
					.sum();
	long  endSeq = System.currentTimeMillis();
	
	
	long  startPara = System.currentTimeMillis();
	int sum3 = list.parallelStream()
			.map(n -> n*2)
			.mapToInt(n -> n)
			.sum();
	long  endPara= System.currentTimeMillis();
	
//	System.out.println(sum1 + " " + sum2+ " " + sum3);
	System.out.println(sum2+ " " + sum3);
	System.out.println("Seq : " + (endSeq-startSeq));
	System.out.println("Para : " + (endPara-startPara));
	
//	System.out.println(list);
}
}
