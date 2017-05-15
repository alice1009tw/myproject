package oo.shopping;

public class SilverCustomer extends Customer{
	
	public int discount(int price){
		discount = (int) (price*0.9);
//		this.price = discount;
		return discount;
//		System.out.println("折扣後："+this.price);
	}
	
}
