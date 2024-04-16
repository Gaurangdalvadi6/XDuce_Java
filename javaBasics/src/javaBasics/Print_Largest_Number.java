package javaBasics;

import java.util.Collections;
import java.util.Scanner;

public class Print_Largest_Number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A : ");
	int a = sc.nextInt();
	System.out.println("Enter B : ");
	int b = sc.nextInt();
	
//	if (a>b) {
//		System.out.println(a + " is max.");
//	} else {
//		System.out.println(b + " is max.");
//
//	}
	
//	int c = (a>b)?a:b;
//	System.out.println(c + " is max");
	
	int max = Math.max(a, b);
	System.out.println();
	System.out.println(max + " is max");
	
}
}
