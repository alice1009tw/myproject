package oo.abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		System.out.println("請輸入發票號碼:");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		s = (String)s.substring(s.length()-3);
		System.out.println(s);
		if(s==a.get(0) ||  s==a.get(1) || s==a.get(2) || s==a.get(3)){
			System.out.println("恭喜您中獎了！");
		}else{
			System.out.println("沒有中獎！");
		}
	}

}
