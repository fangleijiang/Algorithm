package com.test;

/**
 * ð�������㷨���㷨���Ӷ�O(n*n)
 * ����˼�룺��Ҫ�����һ�����У��Ե�ǰ��δ�ź���ķ�Χ�ڵ�ȫ������
 * ���϶��¶����ڵ����������ν��бȽϺ͵������ýϴ�������³�����С������ð��
 * ����ÿ�������ڵ����ȽϺ������ǵ�����������Ҫ���෴ʱ���ͽ����ǻ�����
 * @author fangleijiang
 *
 */
public class BubbleSort {
	
	public static int[] bubbleSort(int a[]){
		int temp;
		for(int i=0;i<a.length-1;i++){
			//��ǰ���󣬰Ѵ�����������ƣ������Ƚ�
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
	         for(int j=a.length-1;j>i;--j){  //�Ӻ���ǰ����С������ǰ���ƶ��������Ƚ�
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
