package com.test;

/**
 * ����n������1��n��1�ĸ���
 * ����㷨���Ƹ��ӶȲ�O��N������ʵ�˷��˺ܶ�Ĳ���������ÿ�����ֶ��������������Ĳ����������������ּ���Ĳ�����Ч�ʺܵ͡�
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
