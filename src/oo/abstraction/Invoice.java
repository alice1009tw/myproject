package oo.abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(331);
		a.add(821);
		a.add(886);
		a.add(554);
		System.out.println("請輸入發票號碼:");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		s = s.substring(s.length()-3);
		int i = Integer.parseInt(s);
		System.out.println("尾數3碼:"+s);
		if(i==a.get(0) ||  i==a.get(1) || i==a.get(2) || i==a.get(3)){
			System.out.println("恭喜您中獎了！");
		}else{
			System.out.println("沒有中獎！");
		}
	}

}
