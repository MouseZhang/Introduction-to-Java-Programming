package com.cn.ustb.mouse.advanced;

public class WildCardNeedDemo {
	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(-2);
		
		System.out.print("The max number is " + max(intStack));
	}
	
	//<? extends Number>是一个表示Number或Number的子类型的通配类型
	public static double max(GenericStack<? extends Number> stack) {
		double max = stack.pop().doubleValue();
		
		while (!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if (value > max)
				max = value;
		}
		
		return max;
	}
}
