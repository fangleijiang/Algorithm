package com.test;

/**
 * 求数组子序列最大值,此算法使用的是动态规划，算法复杂度为O（N）
 * 
 * @author fangleijiang
 */

public class MaxSum2 {

	public static int max(int a[]) {
		int nstart = a[a.length - 1];
		int nAll = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			if (nstart < 0) {
				nstart = 0;
			}
			nstart += a[i];
			if (nstart > nAll) {
				nAll = nstart;
			}
		}
		return nAll;
	}

	public static void main(String[] args) {
		int a[] = { 5, 1, 4, 2, 9, 20 };
		System.out.println(max(a));
	}

}
