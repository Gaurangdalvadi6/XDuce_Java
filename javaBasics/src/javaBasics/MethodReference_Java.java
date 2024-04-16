package javaBasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReference_Java {
public static void main(String[] args) {
	List<String> ls = Arrays.asList("Java","Python","dotNet","JavaScript");
	
	List<String> names = ls.stream()
							.map(String::toUpperCase)
							.toList();
	
	List<String> names1 = ls.stream()
							.map(String::toLowerCase)
							.toList();
	
	
	System.out.println(names);
	System.out.println(names1);
	
}
}
