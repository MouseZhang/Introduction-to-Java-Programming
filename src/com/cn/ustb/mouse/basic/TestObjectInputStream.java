package com.cn.ustb.mouse.basic;
import java.io.*;

public class TestObjectInputStream {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try (
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
		) {
			String name = input.readUTF();
			double score = input.readDouble();
			java.util.Date date = (java.util.Date)(input.readObject());
			System.out.println(name + " " + score + " " + date);
		}
	}

}
