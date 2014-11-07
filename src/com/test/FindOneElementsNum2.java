package com.test;

public class FindOneElementsNum2 {
	public static int count(int v){
		int num = 0;
		while(v!=0){
			if(v % 2 == 1){
				num++;
			}
			v = v/2;
		}
		return num++;
	}
	public static void main(String[] args) {
		System.out.println(count(255));
	}

}
