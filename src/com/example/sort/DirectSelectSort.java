package com.example.sort;

/**
 * 直接选择排序
 * @author kawano
 * 2018年8月27日下午4:48:14
 */
public class DirectSelectSort {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// 直接选择排序
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			// 最小数的索引
			int n = i; 
			for (int j = i + 1; j < a.length; j++) {
				// 找出最小的数
				if (a[j] < min) { 
					min = a[j];
					n = j;
				}
			}
			a[n] = a[i];
			a[i] = min;

		}
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
