package com.test;
/**
 * �鿴����������1�ĸ���
 * @author fangleijiang
 *
 */
public class FindOneElementsNum {
	
	static int count(int v){
		int num = 0;
		while(v!=0){
			num += v & 0x01;
			v>>=1;
		}
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println(count(255));
	}

}
