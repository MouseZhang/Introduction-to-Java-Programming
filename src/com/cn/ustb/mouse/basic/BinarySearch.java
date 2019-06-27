package com.cn.ustb.mouse.basic;

public class BinarySearch {
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid -1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -low - 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		int i = binarySearch(list, 2);
		int j = binarySearch(list, 11);
		int k = binarySearch(list, 12);
		int l = binarySearch(list, 1);
		int m = binarySearch(list, 3);
		System.out.println(j);
	}

}
