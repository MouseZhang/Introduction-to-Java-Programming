package com.cn.ustb.mouse.basic;
import java.io.*;

public class Copy {
	/** Main method
		@param args[0] for source file
		@param args[1] for target file
	 */
	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.out.println("Usage: java Copy sourceFile targetFile");
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
			BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
			BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
		) {
			int r, numberOfBytesCopied = 0;
			while ((r = input.read()) != -1) {
				output.write((byte)r);
				numberOfBytesCopied++;
			}
			
			System.out.println(numberOfBytesCopied + " bytes copied");
		}
	}
}
