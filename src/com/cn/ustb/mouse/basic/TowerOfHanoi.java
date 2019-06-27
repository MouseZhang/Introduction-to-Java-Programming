package com.cn.ustb.mouse.basic;
import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		
		System.out.println("The moves are: ");
		moveDisks(n, 'A', 'B', 'C');
	}

	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		if (n == 1)
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);		//基本情况
		else {
			moveDisks(n - 1, fromTower, auxTower, toTower);										//n-1从A移动到C
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);		//n从A移动B
			moveDisks(n - 1, auxTower, toTower, fromTower);										//n-1从C移动到B
		}
	}
}
