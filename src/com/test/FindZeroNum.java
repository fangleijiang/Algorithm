package com.test;

public class FindZeroNum {
	private static long timestamp = System.currentTimeMillis();
     static int ret = 0;
	static int count(int N){
		for(int i = 1; i<=N;i++){
			int j = i;
			while(j%5==0){
				ret ++;
				j/=5;
			}
		}
		return ret;
	}
	
	static int lowestOne(int N){
		int ret = 0;
		while(N!=0){
			N >>= 1;
			ret += N;
		}
		return ret;
	}

	static int count2(int N){
		int ret = 0;
		while(N!=0){
			ret += N/5;
			N/=5;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(count(10));
		System.out.println(count2(10));
		System.out.println(lowestOne(5));
		System.out.println(timestamp);
		System.out.println(System.currentTimeMillis());
		System.out.println((long)System.currentTimeMillis()-timestamp);
	}
}
