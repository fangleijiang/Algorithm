package com.test;

import java.util.Random;
/**
 * 穷举法，复杂度为O(n*n)，不提倡
 * @author fangleijiang
 *
 */
public class FindMainElements {

	public static int find(int a[]) {
		int mainelement = 0;
		for (int j = 0; j < a.length; j++) {
			int k = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == a[j]) {// 让数组里面的数和m比较
					k++;
				}
				if (k > (a.length / 2)) {
					mainelement = a[j];
					return mainelement;
				} else {
					mainelement = -100000;
				}
			}

		}
		return mainelement;

	}

	public static void main(String[] args) {
		int a[] = { 5, 5, 3, 3, 3, 3, 3, 3, 4, 6 };
		System.out.println(find(a));
	}

}
