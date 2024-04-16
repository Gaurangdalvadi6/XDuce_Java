package javaBasics;

import java.util.Scanner;

public class Conditions_Practice_Question {
	public static void main(String[] args) {

//		Question1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter value : ");
//		int a = sc.nextInt();
//		
//		if (a<0) {
//			System.out.println("negative value.");
//		}
//		else if (a == 0) {
//			System.out.println("zero.");
//		}
//		else {
//			System.out.println("positive value.");
//		}

//		Question2
//		double temp= 103.5;
//		String s= (temp>100)?"Fever":"Not Fever";
//		System.out.println(s);

//		Question3
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Day Between 1 To 7 : ");
//		int week = sc.nextInt();
//		switch (week) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wendesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("Please Enter Valid Input");
//		}

//		Question4
//		int a=63,b=36;
//		boolean x = (a<b)?true:false;
//		System.out.println(x);
//		int y = (a>b)?a:b;
//		System.out.println(y);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter year : ");
		int year = sc.nextInt();

//		if (year % 400 == 0) {
//			System.out.println(year + " is leap year");
//		} else if (year % 100 == 0) {
//			System.out.println(year + " is not leap year");
//		} else if (year % 4 == 0) {
//			System.out.println(year + " is leap year");
//		} else {
//			System.out.println(year + " is not leap year");
//		}
		
		if ((year%4==0)&&((year%100!=0)||(year%400==0))) {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not leap year");
		}

	}
}
