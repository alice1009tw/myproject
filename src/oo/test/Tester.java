package oo.test;

import java.util.ArrayList;

import oo.abstraction.*;
import oo.stati.Student;

public class Tester { // java中會自動繼承Object類別

	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu);

		Car c = new Car("TOYOTA", 1800, "ALTIS", "SEDAN");
		ArrayList<String> a = new ArrayList(); // 在<>裡定義資料型態
		// String[] numbers = {"331", "821", "886", "554"};
		a.add("331");
		a.add("821");
		// a.add(123);
		a.add("886");
		// a.add(true);
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(2, "885");
		System.out.println(a);
		String data = (String) a.get(0);
		System.out.println(data);
		System.out.println(a.get(1));
		// int n = (int)a.get(4);
		// Student stu = new Student();
		// 如果Student類別中的Student()前有加public才能在這個package中使用

	}
}
