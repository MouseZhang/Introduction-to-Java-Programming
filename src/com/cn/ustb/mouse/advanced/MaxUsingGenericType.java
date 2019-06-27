package com.cn.ustb.mouse.advanced;

public class MaxUsingGenericType {
	public static <E extends Comparable<E>> E max(E o1, E o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else 
			return o2;
	}
}
