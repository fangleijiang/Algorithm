package com.test;

/*
 * ����˼�룺ѡ��һ����׼Ԫ��,ͨ��ѡ���һ��Ԫ�ػ������һ��Ԫ��,
 * ͨ��һ��ɨ�裬���������зֳ�������,һ���ֱȻ�׼Ԫ��С,
 * һ���ִ��ڵ��ڻ�׼Ԫ��,��ʱ��׼Ԫ�������ź�������ȷλ��,
 * Ȼ������ͬ���ķ����ݹ�����򻮷ֵ������֡�
 */
public class QuickSort {
	
	public static int[] quickSort(int[] arr) {
		qsort(arr, 0, arr.length - 1);
		return arr;
	}

	private static void qsort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = partition(arr, low, high); // �������Ϊ������
			qsort(arr, low, pivot - 1); // �ݹ�������������
			qsort(arr, pivot + 1, high); // �ݹ�������������
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low]; // �����¼
		while (low < high) {
			while (low < high && arr[high] >= pivot)
				{--high;}
			arr[low] = arr[high]; // ����������С�ļ�¼�����
			while (low < high && arr[low] <= pivot)
				{++low;}
			arr[high] = arr[low]; // ����������С�ļ�¼���Ҷ�
		}
		// ɨ����ɣ����ᵽλ
		arr[low] = pivot;
		// ���ص��������λ��
		return low;
	}

	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 7, 6, 5, 9, 20, 12, 24, 13, 25, 3 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(quickSort(a)[i]);
		}
	}

}
