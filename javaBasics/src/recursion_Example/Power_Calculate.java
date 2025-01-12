package recursion_Example;
// 11/4/2024
public class Power_Calculate {
//	public static int powerCalculate(int x,int n) {
//		if (n==0) {
//			return 1;
//		}
//		return x*powerCalculate(x, n-1);
//	}
	
	public static int optimizedPowerCalculate(int x,int n) {
		if (n==0) {
			return 1;
		}
		int halfPower = optimizedPowerCalculate(x, n/2);
		int halfPowerSq = halfPower*halfPower;
		if (n%2!=0) {
			halfPowerSq = x*halfPowerSq;
		}		
		return halfPowerSq;
	}
	public static void main(String[] args) {
		int a=2;int b=10;
		System.out.println(optimizedPowerCalculate(a, b));
	}
}
