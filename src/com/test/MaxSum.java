package com.test;
/**
 * �������������е�����
 * ����㷨�ĸ��ӶȺͶ�̬�滮��һ����ͬ����O��N��������һ��forѭ��
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
