package com.test;

/**
 * 冒泡排序算法，算法复杂度O(n*n)
 * 基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，
 * 自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 * @author fangleijiang
 *
 */
public class BubbleSort {
	
	public static int[] bubbleSort(int a[]){
		int temp;
		for(int i=0;i<a.length-1;i++){
			//从前往后，把大的数往后面推，两两比较
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		/*
		 for(int i=0; i<a.length;++i){  
	         for(int j=a.length-1;j>i;--j){  //从后往前，把小的数往前面移动，两两比较
	             if(a[j] <a[j-1]){  
	                    temp = a[j];  
	                    a[j] = a[j-1];  
	                    a[j-1] = temp;  
	             }  
	       }  
	   }  
		 */
		return a;
	}

	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 7, 6, 5,9,20,12,24,13,25,3 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(bubbleSort(a)[i]);
		}
	}
	
}
