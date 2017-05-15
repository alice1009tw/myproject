package oo.shopping;

public class Tester {

	public static void main(String[] args) {
		Customer c = new Customer();
		SilverCustomer s = new SilverCustomer();
		GoldenCustomer g = new GoldenCustomer();
		System.out.println("一般會員:"+c.money(6000));
		System.out.println("銀級會員:"+c.money(8000)+"\t"+s.discount(8000));
		System.out.println("銀級會員:"+c.money(10000)+"\t"+s.discount(10000));
		System.out.println("金級會員:"+c.money(30000)+"\t"+s.discount(30000)+"\t"+g.bonus(30000));
		System.out.println("一般會員:"+c.money(2000));
		System.out.println("金級會員:"+c.money(10000)+"\t"+s.discount(10000)+"\t"+g.bonus(10000));
	}

}
