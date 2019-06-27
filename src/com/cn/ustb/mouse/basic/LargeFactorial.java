package com.cn.ustb.mouse.basic;
import java.math.*;


public class LargeFactorial {
	public static void main(String[] args) {
		System.out.println("50! is \n" + factorial(50000));
	}
	
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;		// BigInteger.ONE和new BigInteger("1")是一样的
		for (int i = 1; i <= n; i++)
			result = result.multiply(new BigInteger(i + ""));
		
		return result;
	}

}
