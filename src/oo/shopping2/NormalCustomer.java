package oo.shopping2;

public class NormalCustomer extends Customer {
	public NormalCustomer(int price) {
		super(price);
		this.price = price;
	}
	@Override
	public void print() {
		System.out.println(price + "\t" + price + "\t0");
	}
}
