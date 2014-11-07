package com.test;

/**
 * 给定n，查找1～n中1的个数
 * 这个算法看似复杂度才O（N），其实浪费了很多的操作，它对每个数字都进行了求余数的操作，对于输入数字极大的操作，效率很低。
 * @author fangleijiang
 */
public class FindOneNum {
	public static int FindOneNum1(int n){
		int number = 0,j=1;
		for(int i=1;i<=n;i++){
			j=i;
				while(j!=0){
					if(j%10==1){
						number++;
					}
					j = j/10;
				}
		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(FindOneNum1(100000000));
	}
}
