package com.test2;

public class Demo1 {
	
	public static void main(String[] args) {
		printNum(2468);
	}

	public static void printNum(int x) {
		if (x <= 10000) {
			System.out.print(x + ",");
			printNum(x << 1);
			System.out.print("," + x);
		} else {
			System.out.print(x + "," + x);
		}
	}


}
