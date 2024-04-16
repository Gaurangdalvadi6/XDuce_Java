package loopsExample;

import java.util.Scanner;

//date 8/4/2024
public class PracticeQuestion {
	public static void main(String[] args) {

//		Quesion 1
//	for (int i = 0; i < 5; i++) {
//		System.out.println("Hello");
//		i+=2;
//	}

//		Question 2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of A : ");
//		int a = sc.nextInt();
//		int Evensum = 0;
//		for (int i = 0; i <= a; i++) {
//			if (i%2==0) {
//				Evensum = Evensum +i;
//			}
//		}
//		System.out.println("sum of Even Number : " + Evensum);
//		
//		int Oddsum = 0;
//		for (int i = 0; i <= a; i++) {
//			if (i%2!=0) {
//				Oddsum = Oddsum +i;
//			}
//		}
//		System.out.println("sum of Even Number : " + Oddsum);
//		
//		System.out.println("sum of 0 to " + a + " is : "+ (Evensum+Oddsum));
		
		
//		Question 3
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the input : ");
//		int a = sc.nextInt();
//		
//		int factorial = 1;
//		for (int i = 1; i <= a; i++) {
//			factorial = factorial*i;
//		}
//		System.out.println("factorial of " + a +" is "+factorial);
		
//		Question 4
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
}
