package com.test;
/**
 * 简单选择排序，算法复杂度为O（n*n）
 * 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 * @author fangleijiang
 *
 */
public class selectSort {
	
	public static int[] selectSort(int a[]){
		int position = 0;
		for(int i=0;i<a.length;i++){
			int temp = a[i];
			position =i;
			int j = i+1;
			for(;j<a.length;j++){
				if(a[j]<temp){
					temp = a[j];
					position = j;
				}
			}
			a[position] = a[i];
			a[i] = temp;
		}
		
		//另一种简单写法
		/*
		 for(int i=0;i<a.length;i++){  
			  
		       for(int j=i+1;j<a.length;j++){  
		  
		       if(a[i]>a[j]){  
		  
		           temp=a[i];  
		  
		           a[i]=a[j];  
		  
		           a[j]=temp;  
		  
		       }  
		  
		       }  
		  
		    }  
		
		*/
		
		return a;
	}
	
	public static void main(String[] args) {
		
		int a[] = {2,5,1,4,6,9,8,0};
		for (int i = 0; i < a.length; i++) {
			System.out.println(selectSort(a)[i]);
			
		}
	}

}
