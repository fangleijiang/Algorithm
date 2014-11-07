package com.test;

/**
 * ���㷨Ч�ʼ��ߣ��㷨���Ӷ�ΪO(n)
 * ����������Ԫ�ػ����ָ�������ط�����û������һ���벻���ġ����ַ�����ԭ�������һ�������д���һ����Ԫ�أ���������n/2������ͬʱɾ����������ȵ�ֵ�������Ԫ�ز���ı䡣
	�򵥵�˵��һ����СΪn�����д���һ��Ԫ�صĸ�������n/2����������������������Ԫ�غ͸���Ԫ�ؽ��е����Ļ������ʣ�µ�һ������Ԫ�أ���Ϊ��Ԫ�ظ�����ࡣ
	�÷���������O(n)��ʱ�����ҵ���Ԫ�أ�ʮ�ָ�Ч��
 * @author fangleijiang
 * 
 */
public class FindMainElements2 {

	public static int find(int array[]) {
		int seed = array[0];
		int count = 1;
		for (int i = 1; i < array.length; ++i) {
			if (seed == array[i]) {
				count++;
			} else {
				if (count > 0)
					count--;
				else {
					seed = array[i];
				}
			}
		}
		count = 0;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] == seed)
				++count;
		}
		if (count >= array.length / 2)
			{return seed;}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = {4, 3, 3, 1, 6,3,3 };
		System.out.println(findMain(a));
		
	}
	
	
	
	//���淽������һ��д�������д���򵥺ܶ�
	public static int findMain(int a[]){
		int ntimes,i;
		int mainElement = 0;
		for(i = ntimes = 0;i < a.length;i++){
			if(ntimes==0){
				mainElement = a[i];
				ntimes = 1;
			}
			else{
				if(mainElement ==a[i]){
					ntimes++;
				}
				else{
					ntimes--;
				}
			}
			
			
		}
		
		
		return mainElement;
	}
}
