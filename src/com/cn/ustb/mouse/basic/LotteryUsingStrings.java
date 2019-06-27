package com.cn.ustb.mouse.basic;
import java.util.Scanner;

public class LotteryUsingStrings {
	public static void main(String[] args) {
		String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits): ");
		String guess = input.nextLine();
		
		char lotteryDigit1 = lottery.charAt(0);
		char lotteryDigit2 = lottery.charAt(1);
		
		char guessDigit1 = guess.charAt(0);
		char guessDigit2 = guess.charAt(1);
		
		System.out.println("The lottery number is " + lottery);
		
		if (guess.equals(lottery))
			System.out.println("Exact match: you win $10000");
		else if ((guessDigit2 == lotteryDigit1) && (guessDigit1 == lotteryDigit2))
			System.out.print("Match all digits: you win $3000");
		else if ((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) || (guessDigit2 == lotteryDigit1) || (guessDigit2 == lotteryDigit2))
			 System.out.println("Match one digit: you win $1000");
		else 
			System.out.println("Sorry, no match");
	}

}
