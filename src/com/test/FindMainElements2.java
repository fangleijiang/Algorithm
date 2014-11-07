package com.test;

/**
 * 此算法效率极高，算法复杂度为O(n)
 * 关于这种主元素还有种更加巧妙地方法，没看到过一定想不到的。这种方法的原理是如果一个数组中存在一个主元素（个数大于n/2），则同时删除两个不相等的值，这个主元素不会改变。
	简单的说就一个大小为n数组中存在一个元素的个数大于n/2，则如果用这个数组中其他元素和该主元素进行抵消的话，最后剩下的一定是主元素，因为主元素个数最多。
	该方法可以在O(n)的时间内找到主元素，十分高效。
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
	
	
	
	//上面方法的另一种写法，这个写法简单很多
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
