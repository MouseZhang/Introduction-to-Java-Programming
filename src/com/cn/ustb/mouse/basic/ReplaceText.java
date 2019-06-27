package com.cn.ustb.mouse.basic;
import java.io.*;
import java.util.*;

public class ReplaceText {
	public static void main(String[] args) throws Exception {
		if (args.length != 4) {
			System.out.println("Usage: java ReplaceText sourFile targetFile oldStr newStr");
			System.exit(1);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(2);
		}
		
		File targetFile = new File(args[1]);
		if (targetFile.exists()) {
			System.out.println("Target file " + args[1] + " already exists");
			System.exit(3);
		}
		
		try (
			Scanner input = new Scanner(sourceFile);
			PrintWriter output = new PrintWriter(targetFile);
		) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[2], args[3]);
				output.println(s2);
			}
		}
	}

}
