package com.cn.ustb.mouse.basic;
import java.io.*;

public class TestObjectStreamForArray {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		int[] numbers = {1, 2, 3, 4, 5};
		String[] strings = {"John", "Susan", "Kim"};
		
		try (
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat", true));
		) {
			output.writeObject(numbers);
			output.writeObject(strings);
		}
		
		try (
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"));
		) {
			int[] newNumbers = (int[])(input.readObject());				// readObject()方法返回object对象，故应使用类型转换
			String[] newStrings = (String[])(input.readObject());		// readObject()方法返回object对象，故应使用类型转换
			
			for (int i = 0; i < newNumbers.length; i++)
				System.out.print(newNumbers[i] + " ");
			System.out.println();
			
			for (int i = 0; i < newStrings.length; i++)
				System.out.print(newStrings[i] + " ");
		}
	}

}
