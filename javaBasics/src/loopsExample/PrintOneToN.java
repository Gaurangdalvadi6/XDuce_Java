package loopsExample;

import java.util.Scanner;
//date 5/4/2024
public class PrintOneToN {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number : ");
	int b = sc.nextInt();
	int counter = 1;
	
//	while loop
//	while (counter<=b) {
//		System.out.println(counter);
//		counter++;
//	}
	
//	for loop
//	for (int i = counter; i <= b; i++) {
//		System.out.println(i);
//	}
	
	do {
		System.out.println(counter);
		counter++;
	} while (counter<=b);
}
}
