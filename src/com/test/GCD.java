package com.test;

public class GCD {

	public static int gcd(int x, int y) {
		if (x < y) {
			gcd(y, x);
		}
		if (y == 0) {
			return x;
		} else {
			if (x % 2 == 0) {
				if (y % 2 == 0) {
					return (gcd(x >>= 1, y >>= 1) << 1);
				} else {
					return gcd(x >>= 1, y);
				}
			} else {
				if (y % 2 == 0) {
					return gcd(x, y >>= 1);
				} else {
					return gcd(y, x - y);
				}
			}

		}
	}

	public static void main(String[] args) {
		System.out.println(gcd(42, 30));
	}
}
