package Method;

import java.util.Scanner;

public class Multiply {
	static int calculateMul(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num first :");
	int f= sc.nextInt();
		System.out.println("Enter second num :");
		int g= sc.nextInt();
		int mul =calculateMul(f,g);
		System.out.println("multiply of "+f+ " and " +g+ " is :"+mul);
	}

}
