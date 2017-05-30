package oo.io;

import java.util.Scanner;

public class SumScoresPractice {

	public static void main(String[] args) {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("請輸入數字:");
			String s = scanner.nextLine();
			try{
				int num = Integer.parseInt(s);
				n = n + num;
			}catch(NumberFormatException e){
				System.out.println("Error");
				i--;
			}
		}
		System.out.println(n);
	}

}
