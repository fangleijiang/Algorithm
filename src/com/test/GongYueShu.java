package com.test;

public class GongYueShu {
	
	//շת�����
	public static int gcd(int x,int y){
		return (y==0)?x:gcd(y,x%y);
	}
	//շת���
	public static int gcd2(int x,int y){
		if(x<y){
			return gcd2(y,x);
		}
		else if(y==0){
			return x;
		}
		else
			return gcd2(x-y,y);
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(42,30));
		System.out.println(gcd2(42,30));
	}

}
