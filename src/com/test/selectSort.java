package com.test;
/**
 * ��ѡ�������㷨���Ӷ�ΪO��n*n��
 * ����˼�룺��Ҫ�����һ�����У�ѡ����С��һ�������һ��λ�õ���������
Ȼ����ʣ�µ�������������С����ڶ���λ�õ������������ѭ���������ڶ����������һ�����Ƚ�Ϊֹ��
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
		
		//��һ�ּ�д��
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
