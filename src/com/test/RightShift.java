package com.test;

public class RightShift {
	
	public static int[] rightshift(int arr[],int k){
		while(k!=0){
			int t = arr[arr.length-1];
			for(int i = arr.length-1;i>0;i--){
				arr[i] = arr[i-1];
			}
			k--;
			arr[0] = t;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,'a','b','c','d'};
		int a[] = rightshift(arr,4);
		for(int i = 0; i < arr.length;i++){
			System.out.println(a[i]);
		}
	}

}
