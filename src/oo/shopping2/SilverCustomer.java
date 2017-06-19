package oo.shopping2;

public class SilverCustomer extends Customer {
	public SilverCustomer(int price) {
		super(price);
		this.price = price;
	}

	@Override
	public void print() {
		System.out.println(price + "\t" + price * discount + "\t0");
	}
}
