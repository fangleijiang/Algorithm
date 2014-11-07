package com.test;

/**
 * ϣ������ ����˼�룺�㷨�Ƚ�Ҫ�����һ������ĳ������d��n/2,nΪҪ�������ĸ������ֳ������飬
 * ÿ���м�¼���±����d.��ÿ����ȫ��Ԫ�ؽ���ֱ�Ӳ�������Ȼ������һ����С��������d/2���������з��飬��
 * ÿ�����ٽ���ֱ�Ӳ������򡣵���������1ʱ������ֱ�Ӳ��������������ɡ�
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
