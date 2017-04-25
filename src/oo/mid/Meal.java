package oo.mid;

import java.util.Scanner;

public class Meal {

	public static void main(String[] args) {
		System.out.print("請輸入套餐代碼(1~3):");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int i = Integer.parseInt(s);
		System.out.print("請輸入訂購數量:");
		Scanner scanner1 = new Scanner(System.in);
		String s1 = scanner.nextLine();
		int m = Integer.parseInt(s1);
		int a = 100;
		int[] n = {1,2,3};
		int j = 0;
		if(i==n[0] || i==n[1] || i==n[2]){
			j = j+1;
		}
		System.out.println("您訂購了"+i+"號餐"+m+"份");
		System.out.println("一共是"+m*a+"元");
	}

}
