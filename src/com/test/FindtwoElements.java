package com.test;

/**
 * �ҳ�����������������������һ����������������������飬Ȼ����i=0��j=n-1����arr[i]+arr[j]�Ƿ����sum������ǣ�����������С��sum����i=i+1���������sum����j=j-1
 * ���㷨���Ӷ�ΪO��NlogN��
 * @author fangleijiang
 *
 */
public class FindtwoElements {
	public static void main(String[] args) {
		int a[] = {1,7,4,2,5,3,6,9};
		QuickSort.quickSort(a);
		int Sum = 5;
		for(int i = 0,j = a.length-1;i<j;){
			if(a[i]+a[j]==Sum){
				System.out.println(a[i]+"+"+a[j]);
				return;
			}
			else if(a[i]+a[j]<Sum){
				i++;
			}
			else{
				j--;
			}
		}
	}

}
