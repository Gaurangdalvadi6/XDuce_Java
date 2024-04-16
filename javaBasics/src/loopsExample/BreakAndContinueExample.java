package loopsExample;

import java.util.Scanner;
//date 5/4/2024
public class BreakAndContinueExample {

	public static void main(String[] args) {
//		int a = 10;
//		for (int i = 0; i <= a; i++) {
//			if (i == 3) {
//				break;
//			}
//			System.out.println(i);
//		}

		Scanner sc = new Scanner(System.in);

//		do {
//			System.out.println("Enter the number : ");
//			int a = sc.nextInt();
//			if (a % 10 == 0) {
//				break;
//			}
//			System.out.println(a);
//		} while (true);

//		while (true) {
//		System.out.println("Enter the number : ");
//			int a = sc.nextInt();
//			if (a%10==0) {
//				break;
//			}
//			System.out.println(a);
//		}
		
//		System.out.println("Enter the value : ");
//		int s = sc.nextInt();
//		for (int i = 0; i <= s; i++) {
//			if (i==2) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		while (true) {
			System.out.println("Enter the value : ");
			int s = sc.nextInt();
			if (s%10==0) {
				continue;
			}
			System.out.println(s);
		}
	}
}
