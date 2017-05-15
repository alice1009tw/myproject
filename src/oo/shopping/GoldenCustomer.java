package oo.shopping;

public class GoldenCustomer extends Customer{
	
	public void minus(int price){
		discount = (int) (price*0.9);
		this.price = discount;
		System.out.print("折扣後："+this.price+"元"+"\t");
	}
	
	public void bonus(int price){
		bonus = (int) (price*0.05);
		System.out.println("獲得5%回饋金："+bonus+"元");
	}
}
