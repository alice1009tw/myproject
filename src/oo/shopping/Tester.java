package oo.shopping;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Customer c = new Customer();
		SilverCustomer s = new SilverCustomer();
		GoldenCustomer g = new GoldenCustomer();
		System.out.println("一般會員:");
		c.money(6000);
		c.money(2000);
		System.out.println();
		System.out.println("銀級會員:");
		s.money(8000);
		s.minus(8000);
		s.money(10000);
		s.minus(10000);
		System.out.println();
		System.out.println("金級會員:");
		s.money(30000);
		g.minus(30000);
		g.bonus(30000);
		s.money(10000);
		g.minus(10000);
		g.bonus(10000);
	}

}
