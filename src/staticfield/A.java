package mypack;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 줄을 출력할까요?");
		int lastLine = scan.nextInt();
		
		
	
		
		for (int line = 1; line <= lastLine; line ++) {
			for (int star = 1; star <= line; star ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		

		for (int line = 1; line <= lastLine; line ++) {
			for (int space = 1; space <= lastLine - line; space ++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		
		for (int line = 1; line <= lastLine; line ++) {
			for (int space = 1; space <= lastLine - line; space ++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line * 2 - 1; star ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
