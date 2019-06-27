package com.cn.ustb.mouse.basic;
import java.io.File;
import java.util.Scanner;

public class DirectorySize {
	public static void main(String[] args) {
		System.out.print("Enter a directory or a file: ");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();
		
		System.out.println(getSize(new File(directory)) + " bytes");
	}
	
	public static long getSize(File file) {
		long size = 0;
		
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; files != null && i < files.length; i++) {   //数组的.length
				size += getSize(files[i]);
			}
		}
		else {
			size += file.length();										// 字符串的.length()
		}
		
		return size;
	}

}
