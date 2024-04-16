package fuctionsAndMethods;
// 8/4/2024
import java.util.Scanner;

public class BinomialCoefficient {

	public static int nCr(int n,int r) {
		int nFact = Find_Factorial.factorial(n); // calling helper function
		int rFact = Find_Factorial.factorial(r);
		int nmr = Find_Factorial.factorial(n-r);
		int nCrFact = nFact/(rFact*nmr);
		return nCrFact;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int binomialCoefficient =nCr(4, 2);
		System.out.println(binomialCoefficient);
	}
}
