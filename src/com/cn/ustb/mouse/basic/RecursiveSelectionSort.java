package com.cn.ustb.mouse.basic;

public class RecursiveSelectionSort {
	public static void sort(double[] list) {
		sort(list, 0, list.length - 1);
	}
	
	private static void sort(double[] list, int low, int high) {
		if (low < high) {
			int indexOfMin = low;
			double min = list[low];
			for (int i = low + 1; i <= high; i++) {
				if (list[i] < min) {
					min = list[i];
					indexOfMin = i;
				}
			}
			
			list[indexOfMin] = list[low];
			list[low] = min;
			
			sort(list, low + 1, high);
		}
	}
}