package javaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Print_Largest_From_Three_Variable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value of A : ");
	int a = sc.nextInt();
	System.out.println("Enter the value of B : ");
	int b = sc.nextInt();
	System.out.println("Enter the value of C : ");
	int c = sc.nextInt();
	
//	if (a>b && a>c) {
//		System.out.println("A is Max");
//	}
//	else if (b>a && b>c) {
//		System.out.println("B is Max");
//	}
//	else {
//		System.out.println("C is Max");		
//	}
	
	ArrayList<Integer> l = new ArrayList<Integer>();
	l.add(a);
	l.add(b);
	l.add(c);
	
	System.out.println(Collections.max(l));
	
}
}
