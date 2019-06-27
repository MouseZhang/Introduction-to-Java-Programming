package com.cn.ustb.mouse.basic;
import java.io.*;

public class TestObjectOutputStream {
	public static void main(String[] args) throws IOException {
		try (
		//  提高程序的性能
		//  ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.dat")));
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
		) {
				output.writeUTF("John");					// 写入字符串
				output.writeDouble(85.8);					// 写入基本类型值
				output.writeObject(new java.util.Date());   // 写入对象
			}
	}
}
