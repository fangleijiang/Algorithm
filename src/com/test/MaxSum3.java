package com.test;

/**
 * ����˫��ѭ��ͬ��Ҳ�ܹ��ﵽЧ����ֻ���㷨���ӶȱȽϸߣ�ΪO��N*N��
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
