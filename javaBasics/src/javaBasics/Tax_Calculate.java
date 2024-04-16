package javaBasics;

import java.util.Scanner;

public class Tax_Calculate {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the value in lakh");
	int income = sc.nextInt();
	double tax;
	
	if (income < 5) {
		tax = 0;
	}
	else if (income>= 5 && income<10) {
		tax = income*(0.2);
	}
	else {
		tax = income*(0.3);
	}
	System.out.println("Your tax is : " + tax);
}
}
