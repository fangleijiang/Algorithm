package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ĵ��������У�����㷨������һ��˫��ѭ�����㷨���Ӷ�ΪO��N��N��
 * �������ȷʵ�Ƚ�����
 * @author fangleijiang
 * 
 */
public class FindLongIncreaseElements {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List findelements(int arr[]) {
		List list = null;
		List list2 = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			list = new ArrayList();
			list.add(arr[i]);
			int length = list2.size();
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > (int) list.get(list.size() - 1)) {
					list.add(arr[j]);
				}
			}
			if (list.size() > length) {
				length = list.size();
				list2.clear();
				list2.addAll(list);
			}
		}
		return list2;
	}

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		int arr[] = { -3, 1, 2, -9, 6 };
		List list = findelements(arr);
	
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
