package oo.shopping;

public class GoldenCustomer extends SilverCustomer{
	float bonusrate = 0.05f;
	
	public GoldenCustomer(int price){
		super(price);
	}
	
	@Override
	public void print(){
		System.out.println(price+"\t"+price*discount+"\t"+price*bonusrate);
	}
}
