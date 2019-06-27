package com.cn.ustb.mouse.basic;
import java.util.Arrays;

public class FillArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 7, 7, 10};
		java.util.Arrays.fill(list1, 5);
		java.util.Arrays.fill(list2, 1, 5, 8);
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
	}

}
