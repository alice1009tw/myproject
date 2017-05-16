package oo.shopping;

public class SilverCustomer extends Customer{
	float discount = 0.9f;
	
	public SilverCustomer(int price){
		super(price);
	}
	
	@Override
	public void print(){
		System.out.println(price+"\t"+price*discount+"\t0");
	}
	
}
