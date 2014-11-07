package com.test;

public class MinSum {

	public static int minSum(int a[]){
		int sum=0,min=findmaxelement(a);
		for(int i=0;i<a.length;i++){
			sum +=a[i];
			if(sum<min){
				min = sum;
			}
			else if(sum>0){
				sum = 0;
			}
		}
		return  min;
	}
	
	public static int findmaxelement(int a[]){
		int max=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		//System.out.println(max);
		return max;
	}
	
	public static void main(String[] args) {
		int a[] = {5,2,8,1,9,20};
		System.out.println(minSum(a));
	}
}
