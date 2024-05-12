package Method;

import java.util.Scanner;

public class sumOfTwonum {
	public static int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of A :");
	int a = sc.nextInt();
	System.out.println("Enter the value of B :");
	int b = sc.nextInt();
	int s = sum(a,b);
	System.out.println("sum of 2 num is  :"+s);
}
}
