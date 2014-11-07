package com.test;

/**
 * 此算法用了一个双重循环，让单个元素和后面每个元素求差值，找出最小的差值，算法复杂度为O（N*N）
 * @author fangleijiang
 *
 */
public class Mindifference {

	public static double mindifference(int arr[]) {
		int length = arr.length;
		double mind = 0;
		if (length < 2) {
			return 0;
		} else {
			mind = Math.abs(arr[0] - arr[1]);
			for (int i = 0; i < length; i++) {
				for (int j = i + 1; j < length; j++) {
					double temp = Math.abs(arr[i] - arr[j]);
					if (temp < mind) {
						mind = temp;
					}
				}
			}
		}
		return mind;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 9, 7 };
		System.out.println(mindifference(arr));
	}
}
