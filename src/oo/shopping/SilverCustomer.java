package oo.shopping;

public class SilverCustomer extends Customer{
	
	public void money(int price){
		System.out.print("金額："+price+"元"+"\t");
	}
	
	public void minus(int price){
		discount = (int) (price*0.9);
		this.price = discount;
		System.out.println("折扣後："+this.price+"元");
	}
	
}
