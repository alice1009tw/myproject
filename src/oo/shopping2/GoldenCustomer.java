package oo.shopping2;

public class GoldenCustomer extends Customer {

	public GoldenCustomer(int price) {
		super(price);
		this.price = price;
	}

	@Override
	public void print() {
		System.out.println(price + "\t" + price * discount + "\t" + price * moneyback);
	}
}
