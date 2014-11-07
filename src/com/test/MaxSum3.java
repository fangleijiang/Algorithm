package com.test;

/**
 * 利用双重循环同样也能够达到效果，只是算法复杂度比较高，为O（N*N）
 * @author fangleijiang
 *
 */
public class MaxSum3 {
	public static int max(int a[]) {
		int maximum = 0;
		int sum;
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum > maximum) {
					maximum = sum;
				}
			}
		}
		return maximum;
	}

	public static void main(String[] args) {
		int a[] = { 5, 1, 4, 2, 9, 20 };
		System.out.println(max(a));
	}
}
