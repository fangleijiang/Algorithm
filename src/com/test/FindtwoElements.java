package com.test;

/**
 * 找出符合条件的两个数，利用一个快速排序先排序这个数组，然后令i=0，j=n-1，看arr[i]+arr[j]是否等于sum，如果是，则结束。如果小于sum，则i=i+1；如果大于sum，则j=j-1
 * 总算法复杂度为O（NlogN）
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
