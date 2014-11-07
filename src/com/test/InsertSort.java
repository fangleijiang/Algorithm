package com.test;
/**
 * ≤Â»Î≈≈–Ú
 * @author fangleijiang
 *
 */

public class InsertSort {

	public static int[] sort(int[] a) {
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			int j = i - 1;
			for (; j >= 0 && a[j]>temp; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 7, 6, 5 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(sort(a)[i]);
		}

	}
}
