package primos;

import java.util.Scanner;

public class primos1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		boolean isPrime = isPrime(n);
		System.out.printf("number %d is prime %b", n, isPrime);

		sc.close();
	}

	public static boolean isPrime(int n) {
		int p = 2;
		while (p < n && n != 2) {
			boolean isDivisible = isDivisible(n, p);
			if (isDivisible) {
				return false;
			}
			p++;
		}
		return true;
	}

	public static boolean isDivisible(int dividend, int division) {
		return (dividend % division) == 0;
	}
}
