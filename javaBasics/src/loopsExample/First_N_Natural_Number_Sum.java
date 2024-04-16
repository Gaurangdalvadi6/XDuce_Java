package loopsExample;

import java.util.Scanner;
//date 5/4/2024
public class First_N_Natural_Number_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		int sum = 0;
		int counter = 0;
		
//		Using While Loop
//		while (counter<=a) {
//			sum = sum + counter;
//			counter++;
//		}
//		System.out.println(sum);
		
//		Using For Loop
//		for (int i = counter; i <= a; i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		do {
			sum= sum+counter;
			counter++;
		} while (counter<=a);
		System.out.println(sum);
		
	}
}
