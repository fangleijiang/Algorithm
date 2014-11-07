package com.test;

/**
 * 此算法首先是利用快速排序算法对数组中的数字进行排序，算法复杂度为O（N*logN）,排序后再利用一次循环进行比较，复杂度了O(N)
 * 总算法复杂度为O（N*logN）+O（N） ，即为O（N*logN）
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
