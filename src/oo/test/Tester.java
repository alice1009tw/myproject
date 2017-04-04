package oo.test;

import java.util.ArrayList;

import oo.abstraction.*;

public class Tester {

	public static void main(String[] args) {
		Car c = new Car("TOYOTA", 1800, "ALTIS", "SEDAN");
		ArrayList<String> a = new ArrayList();  //在<>裡定義資料型態
//		String[] numbers = {"331", "821", "886", "554"};
		a.add("331");
		a.add("821");
//		a.add(123);
		a.add("886");
//		a.add(true);
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(2, "885");
		System.out.println(a);
		String data = (String)a.get(0);
		System.out.println(data);
		System.out.println(a.get(1));
//		int n = (int)a.get(4);
		
		/*本次開獎號為331 821 886 554
		讓使用者輸入發票號碼(長度不限)判斷尾數3位是否中獎  類別Invoice */
		
	}
	

}
