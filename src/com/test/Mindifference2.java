package com.test;

/**
 * ���㷨���������ÿ��������㷨�������е����ֽ��������㷨���Ӷ�ΪO��N*logN��,�����������һ��ѭ�����бȽϣ����Ӷ���O(N)
 * ���㷨���Ӷ�ΪO��N*logN��+O��N�� ����ΪO��N*logN��
 * @author fangleijiang
 *
 */
public class Mindifference2 {
	
	public static double mindiffrence(int arr[]){
		QuickSort.quickSort(arr);
		double minL = Math.abs(arr[0]-arr[1]);
		for(int i = 2;i<arr.length;i++){
			double temp = Math.abs(arr[i]-arr[i-1]);
			if(temp<minL){
				 minL = temp;
			}
		}
	return minL;	
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 4, 9, 7 };
		System.out.println(mindiffrence(arr));
	}

}
