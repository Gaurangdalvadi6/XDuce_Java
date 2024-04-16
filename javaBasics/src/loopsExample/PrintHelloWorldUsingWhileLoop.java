package loopsExample;

import java.util.Scanner;
//date 5/4/2024
public class PrintHelloWorldUsingWhileLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter How Many Times You Print :");
	int a = sc.nextInt();
	int counter=0;
	while (counter<a) {
		System.out.println((counter+1) +" Hello World");
		counter++;
	}
}
}
