package com.test2;

 class Y{
	
	public static  void test(){
		System.out.println("father");
		
	}
}
 public class Demo extends Y {
	public static void test(){
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.test();
		Y demo2 = new Demo();
		demo2.test();
	}
}
