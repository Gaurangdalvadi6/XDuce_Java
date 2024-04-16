package fuctionsAndMethods;
// 8/4/2024
import java.util.Scanner;

public class PracticeQuestion {

//	Quesion 1
//	public static float FindAverage(int a,int b,int c) {
//		return (a+b+c)/3;
//	}

//	Quesion 2
//	public static boolean isEven(int a) {
//		if (a%2==0) {
//			return true;
//		}
//		return false;
//	}
	
//	Quesion 3
//	public static void palindrome(int n) {
//		int lastDigit;
//		int mainNumber = n;
//		int number = 0;
//		
//		while (n>0) {
//			lastDigit= n%10;
//			number = number*10 + lastDigit;
//			n= n/10;
//		}
//		
//		if (mainNumber==number) {
//			System.out.println("it is palindrome");
//		}
//		else {			
//			System.out.println("it is not ");
//		}
//	}
	
//	Quesion 4
	public static void mathFunction(int a,int b) {
		System.out.println(Math.min(a, b));
		System.out.println(Math.max(a, b));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.pow(a, b));
		System.out.println(Math.abs(a));
	}

	public static void main(String[] args) {

//	System.out.println(FindAverage(25, 26, 27));
//		System.out.println(isEven(26));
//		palindrome(121);


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A : ");
		int a = sc.nextInt();
		System.out.println("Enter B : ");
		int b = sc.nextInt();
		mathFunction(a, b);
		
		
	}
}
