package com.test;

/**
 * 希尔排序 基本思想：算法先将要排序的一组数按某个增量d（n/2,n为要排序数的个数）分成若干组，
 * 每组中记录的下标相差d.对每组中全部元素进行直接插入排序，然后再用一个较小的增量（d/2）对它进行分组，在
 * 每组中再进行直接插入排序。当增量减到1时，进行直接插入排序后，排序完成。
 * 
 * @author fangleijiang
 * 
 */

public class shellSort {

	public static int[] shellSorted(int a[]) {
		double d = a.length;
		int temp = 0;
		while (true) {
			d = Math.ceil(d / 2);
			int d1 = (int) d;
			for (int i = 0; i < d1; i++) {
				for (int j = i + d1; j < a.length; j += d1) {
					temp = a[j];
					int m = j - d1;
					for (; m >= 0 && a[m] > temp; m -= d1) {
						a[m + d1] = a[m];
					}
					a[m + d1] = temp;

				}
			}
			if (d1 == 1)
				break;
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 7, 6, 5, 9, 20, 12, 24, 13, 25, 3 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(shellSorted(a)[i]);
		}
	}
}
