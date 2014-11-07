package com.test;
/**
 * 求数组中子序列的最大和
 * 这个算法的复杂度和动态规划的一样，同样是O（N），仅仅一次for循环
 * @author fangleijiang
 **/
public class MaxSum {
	public static int  max(int a[]){
		int sum = 0;
		int max = 0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
			if(sum>max){
				max = sum;
			}
			else if(sum<0){
				sum=0;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int a[] = {5,1,4,2,9,20};
		System.out.println(max(a));
	}
}
