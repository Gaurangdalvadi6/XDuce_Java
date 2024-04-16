package javaBasics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassInJava {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("Gaurang","Abhay","Devanshu","Harsh","dev");
		
		String s= l.stream()
							.filter(str -> str.contains("D"))
							.findFirst()
							.orElse("Not Found");
		
		System.out.println(s);
							
	}
}
